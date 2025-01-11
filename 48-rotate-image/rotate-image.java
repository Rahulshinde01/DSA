class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose of a matrix
        for(int row = 0; row < n - 1; row ++){
            for(int col = row + 1; col < n; col ++){

                // swaping
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                
            }
        }


        // reversing half of the columns 
        int colLength = n;
        for(int col = 0; col < n / 2; col ++){
            for(int row = 0; row < n; row ++){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[row][colLength - 1];
                    matrix[row][colLength - 1] = temp;
                    
            }
            colLength --;
        }
        
    }
}