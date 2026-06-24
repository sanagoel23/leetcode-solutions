class Solution {
    public int diagonalSum(int[][] mat) {
      int r = mat.length;
      int c = mat[0].length;
      int sum = 0;
      for(int rno = 0; rno < r; rno ++) {
        int primary = mat[rno][rno];
        int secondary = mat[rno][r - rno - 1];

        sum += primary;
        if(rno != r - rno - 1)
        sum += secondary;
        
      }  
      return sum;
    }
}