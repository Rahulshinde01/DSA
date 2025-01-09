class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int max = 0;
        while(i<n){
            int sum = 0;
            while(i<n && nums[i] != 0){
                sum++;
                i++;
            }
            max = Math.max(max, sum);
            i++;
        }
        return max;
    }
}