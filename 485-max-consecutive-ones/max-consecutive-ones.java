class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int len = nums.length;
        boolean flag = false;
        if(nums[0] == 1){
            ans++;
            flag = true;
        }

        int res = ans;

        for(int i = 1; i < len; i++){
            if(flag && nums[i] == 1){
                ans++;
            }
            else if(nums[i] == 1){
                ans = 1;
                flag = true;
            }
            else{
                flag = false;
                ans = 0;
            }

            res = Math.max(ans, res);
        }

        return res;
    }
}