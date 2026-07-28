class Solution {
    public void twoSum(int[] nums, int ind, int target, List<List<Integer>> result) {   
        int i = ind;
        int j = nums.length - 1;
        while(i < j) {
            int a = nums[i];
            int b = nums[j];
            if (a + b == target) {
                List<Integer> lst = new ArrayList<>();
                lst.add(-target);
                lst.add(a);
                lst.add(b);
                result.add(lst);
                i ++;
                while(i < j && nums[i] == nums[i - 1])
                    i ++;
                j --;
                while(i < j && nums[j] == nums[j + 1])
                    j --;

            } else if (a + b > target) {
                j --;
            } else {
                i ++;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i ++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int a = nums[i];
                twoSum(nums, i + 1, -a, result);
            }
        }
        return result;
    }
}