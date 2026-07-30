class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while (left < right) {
            int currArea = Math.min(height[right], height[left]) * (right - left);
            maxArea = Math.max(maxArea, currArea);
            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }
        return maxArea;
    }
}