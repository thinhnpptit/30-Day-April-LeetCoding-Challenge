public class MaximalSquare {
    // Leet 27
    public int maximalSquare(char[][] matrix){

        if (matrix.length == 0 && matrix[0].length == 0)
            return 0;
        int answer = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1'){
                    dp[i][j] = 1;
                    if (i > 0 && j > 0){
                        dp[i][j] += Math.min(dp[i-1][j-1], Math.max(dp[i][j-1], dp[i-1][j]));
                    }
                    answer = Math.max(dp[i][j], answer);
                }
            }
        }
        return answer*answer;
    }
}
