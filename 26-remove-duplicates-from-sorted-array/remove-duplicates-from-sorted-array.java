class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int j = 0;
        for(int i = 0; i < nums.length; i ++) {
            
            if(prev != nums[i]) {
                nums[j] = nums[i];
                j ++;
                prev = nums[i];
            }
        }
        return j;
    }
}