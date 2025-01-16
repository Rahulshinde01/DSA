class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while(s < e){
            int k = s + (e - s) / 2;
            if(target >= arr[k + 1][0]){
                s = k + 1;
            }
            else{
                e = k;
            }
        }

        int col = arr[s].length;
        int x = s;
        s = 0;
        e = col - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target == arr[x][mid]){
                return true;
            }
            else if(target > arr[x][mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }

        return false;
    }
}