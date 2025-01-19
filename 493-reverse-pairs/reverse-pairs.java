class Solution {
    int ans = 0;
    public void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            if((long)L[i] > (2L * R[j])){
                ans += (n1 - i); 
                j++;
            }
            else{
                i++;
            }
            
        }

        i = 0;
        j = 0;

        // Initial index of merged subarray array
        int k = l;
        int s = j;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public void sort(int arr[], int l, int r){
        if (l >= r) {
          return;
        }

        int m = l + (r - l) / 2;

        sort(arr, l, m);
        sort(arr, m + 1, r);

        merge(arr, l, m, r);
        
    }
    public int reversePairs(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return ans;
    }
}