class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return true;
        }

        if(len == 2){
            if(nums[0] == nums[1]){
                return false;
            }
            if(nums[0] % 2 == 0 && nums[1] % 2 != 0){
                return true;
            }
            else if(nums[0] % 2 != 0 && nums[1] % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }

int count = 0;

        for(int i = 1; i < len - 1; i++){
            int val = nums[i];
            if(val == nums[i - 1] || val == nums[i + 1]){
                return false;
            }
            if(val % 2 != 0 && nums[i - 1] % 2 == 0 && nums[i + 1] % 2 == 0 || val % 2 == 0 && nums[i - 1] % 2 != 0 && nums[i + 1] % 2 != 0){
                count++;
            }
            
        }

        if(count == len - 2){
            return true;
        }
        else{
            return false;
        }
    }
}