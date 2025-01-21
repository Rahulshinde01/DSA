class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int len = m * n;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            int val = arr[i];

            map.put(val, i);
        }


        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){

            int lastIndex = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++){
                int val = mat[i][j];

                int index = map.get(val);
                lastIndex = Math.max(lastIndex, index);
            }

            minIndex = Math.min(minIndex, lastIndex);
        }

        for(int i = 0; i < n; i++){

            int lastIndex = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                int val = mat[j][i];

                int index = map.get(val);
                lastIndex = Math.max(lastIndex, index);
            }

            minIndex = Math.min(minIndex, lastIndex);
        }

        return minIndex;
    }
}