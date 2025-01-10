class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;

        int ans = nums[0];
        int sum = 0;

        for(int i = 0; i < len; i++){
            int val = nums[i];

            ans=Math.max(ans,Math.max(sum+val,val));
            sum+=val;
            if(sum<0)
                sum=Math.max(val,0);
        }
        return ans;
    }
}