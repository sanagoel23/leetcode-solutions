class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] nums, int index, int target, List<Integer> combinations) {
        if(target == 0) {
            ans.add(new ArrayList<>(combinations));
            return;
        }
        if(index == nums.length || target < 0) 
            return;


        helper(nums, index + 1, target, combinations);

        combinations.add(nums[index]);
        helper(nums, index, target - nums[index], combinations);
        combinations.remove(combinations.size()-1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, 0, target, new ArrayList<>());
        return ans;
    }
}