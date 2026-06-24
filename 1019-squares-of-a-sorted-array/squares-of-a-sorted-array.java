class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int arr[] = new int[n];

        // for(int i = 0; i < n; i++) 
        //     arr[i] = nums[i] * nums[i];
        // Array.sort(arr);
        // return arr;

        int ind = n - 1;
        int l = 0;
        int r = n - 1;

        while(l <= r) {

            int SqLeft = nums[l] * nums[l];
            int SqRight = nums[r] * nums[r];

            if(SqLeft > SqRight) {    

                arr[ind] = SqLeft;
                l ++;

            } else {

                arr[ind] = SqRight;
                r --;
            }

            ind --;
        }

        return arr;
    }
}
