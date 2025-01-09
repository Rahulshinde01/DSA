class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;

        int i = len - 2;
        // Find first decreasing element from right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            // Find smallest number greater than nums[i] to its right
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // Swap the numbers
            swap(nums, i, j);
        }

        // Reverse the subarray to the right of i
        reverse(nums, i + 1);

    }
}