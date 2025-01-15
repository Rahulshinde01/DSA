class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;

        int ans = 0;
        for(int i = 0; i < len; i++){
            int temp = nums[i];
            nums[i] = nums[temp - 1];
            nums[temp - 1] = temp;

            while(nums[i] != nums[temp - 1]){
                temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));


        for(int i = 0; i < len; i++){
            if(nums[i] != i + 1){
                ans = nums[i];
                break;
            }
        }

        return ans;

    }
}