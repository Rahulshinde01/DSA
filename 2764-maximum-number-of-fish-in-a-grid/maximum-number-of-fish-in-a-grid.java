class Solution {
    public int findMaxFish(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[row][cols];
        int ans = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0 && (!visited[i][j])) {
                    ans = Math.max(ans, dfs(i, j, grid, visited));
                    visited[i][j] = true;
                }
            }
        }

        return ans;
    }

    public int dfs(int r, int c, int[][] grid, boolean[][] visited) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length ||  visited[r][c] || grid[r][c] == 0) {
            return 0;
        }
        visited[r][c] = true;
        int sum = grid[r][c];
        sum += dfs(r + 1, c, grid, visited);
        sum += dfs(r - 1, c, grid, visited);
        sum += dfs(r, c + 1, grid, visited);
        sum += dfs(r, c - 1, grid, visited);
        return sum;
    }
}