class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while(i < j) {
            int a = nums[i];
            int b = nums[j];
            if(a + b == target) {
                return new int []{i + 1, j + 1};
            } else if(a + b > target) {
                j --;
            } else {
                i ++;
            }
        }
        return new int[]{};
    }
}