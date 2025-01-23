class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        int calRow[] = new int[m];
        int calCols[] = new int[n];


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    count++;
                    calRow[i]++;
                    calCols[j]++;
                    
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && calRow[i] == 1 && calCols[j] == 1){
                    count--;
                }
            }
        }

        return count;
    }
}