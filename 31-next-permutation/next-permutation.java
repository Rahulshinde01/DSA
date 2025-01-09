class Solution {
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;

        int ind = -1;
        for(int i = len - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            reverse(nums, 0, len - 1);
            return;
        }

        int j = -1;
        for(int i = len - 1; i >= 0; i--){
            if(nums[ind] < nums[i]){
                j = i;
                break;
            }
        }


        swap(nums, ind, j);

        reverse(nums, ind + 1, len - 1);
    }
}