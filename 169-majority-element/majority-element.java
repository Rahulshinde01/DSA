class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;

        int count = 1;
        int element = nums[0];
        for(int i = 1; i < len; i++){
            int val = nums[i];
            if(count == 0){
                element = nums[i];
                count = 1;
            }
            else if(val == element){
                count++;
            }
            else{
                count--;
            }
        }

        return element;
    }
}