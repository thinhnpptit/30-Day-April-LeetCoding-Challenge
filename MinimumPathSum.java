public class MinimumPathSum {
    // Leet 18
    public int minPathSum(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        // dynamic programming
        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dp[i][j] = grid[i][j];
                if ( i > 0 && j > 0)
                    dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);    // min( right, bottom )
                else if (i > 0)
                    dp[i][j] += dp[i-1][j];
                else if (j > 0)
                    dp[i][j] += dp[i][j-1];
            }
        }
        return dp[row-1][col-1];        // final sum value of dp array 2d
    }
}
