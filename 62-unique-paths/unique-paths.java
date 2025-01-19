class Solution {
    public int helper(int m, int n, int i, int j, int[][] dp) {
        // base case
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // momoized
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = 0;
        if ((i + 1) < m) {
            right = helper(m, n, i + 1, j, dp);
        }

        int down = 0;
        if ((j + 1) < n) {
            down = helper(m, n, i, j + 1, dp);
        }

        dp[i][j] = right + down;

        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // filling 2D array with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(m, n, 0, 0, dp);
    }
}