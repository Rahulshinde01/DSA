class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if((i == m - 1) && (j == n - 1)){
                    dp[m - 1][n - 1] = 1;
                    continue;
                }
                int right = 0;
                int down = 0;
                if(i < m - 1){
                    down = dp[i + 1][j];
                }

                if(j < n - 1){
                    right = dp[i][j + 1];
                }

                dp[i][j] = right + down;
            }
        }

        return dp[0][0];
    }
}