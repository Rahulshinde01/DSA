class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int ans = Integer.MIN_VALUE;
        int total = 0;

        for(int i = 0; i < len; i++){
            total += nums[i];

            if(total < 0){
                total = 0;
                ans = Math.max(ans, nums[i]);
            }
            else{
                ans = Math.max(ans, total);
            }
        }

        return ans;
    }
}