class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0;
        int n = nums.length;
        
        if (n == 1 && nums[0] == 1) return 1;
        if (n == 1 && nums[0] == 0) return 0;
        if (n == 2 && nums[0] == 0 && nums[1] == 1) return 1;
        
        int maxi = 0;
        while (i < n && j < n) {
            if (nums[i] == nums[j] && nums[i] == 1) {
                maxi = Math.max(maxi, j - i + 1);
                j++;
            } else {
                j++;
                i = j;
            }
        }
        return maxi;
    }
}
