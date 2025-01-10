class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;

        int ans = nums[0];
        int sum = 0;

        for(int i = 0; i < len; i++){
            int val = nums[i];

            sum += val;
            if(sum < 0){
                ans = Math.max(ans, val);
                sum=Math.max(0,val);
            }
            else{
                ans = Math.max(ans, sum);
            }
            
        }
        return ans;
    }
}