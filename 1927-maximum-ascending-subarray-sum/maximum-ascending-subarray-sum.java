class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int len = nums.length;
        int sum = 0;
        max = nums[0];
        sum = nums[0];

        for(int i = 1; i < len; i++){
            if(nums[i] <= nums[i - 1]){
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}