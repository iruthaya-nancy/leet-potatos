class Solution {
    public int countSquares(int[][] matrix) {
        //To count [1*1] all the ones
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dp = new int[n]; // only one row
        int total = 0, prev = 0;

        for (int i = 0; i<m;i++){
            prev = 0;
            for(int j = 0;j<n;j++){
                int temp = dp[j];
                if(matrix[i][j] == 1){
                         if (i == 0 || j == 0) {
                        dp[j] = 1;
                    } else {
                        dp[j] = 1 + Math.min(Math.min(dp[j], dp[j - 1]), prev);
                    }
                    total += dp[j];
                }
                else{
                    dp[j]  = 0;
                }
                prev = temp;
            }
        }
        return total;
    }
}