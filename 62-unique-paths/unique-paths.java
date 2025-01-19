class Solution {
    public int uniquePaths(int m, int n) {

        int[] dp = new int[n]; 

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                // base case
                if (i == m - 1 || j == n - 1) {
                    dp[n - 1] = 1;
                }

         
                if (j < n - 1) {
                    dp[j] += dp[j + 1];
                    //     here previous dp[j] is last column ans(j) for last row and dp[j + 1] is the column answer calculated on previous iteration
                }
            }
        }

        return dp[0];

    }
}