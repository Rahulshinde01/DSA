class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = row;

        for(int i = 0; i < row; i++){
            for(int j = i; j < col; j++){
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }


        int j = col - 1;
        for(int k = 0; k < col / 2; k++){
                for(int i = 0; i < row; i++){
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][j];
                        matrix[i][j] = temp;
                        
                }
            j--;
        }

        
    }
}