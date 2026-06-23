class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] n, int index, List<Integer> combinations){
        if(index == n.length){
        ans.add(new ArrayList(combinations));
        return;
        }

    helper(n, index + 1, combinations);

    combinations.add(n[index]);
    helper(n, index + 1, combinations);
    combinations.remove(combinations.size() - 1);
    }
    public List<List<Integer>> subsets (int[] n){
        helper(n, 0, new ArrayList<>());
        return ans;
    }
    }
    