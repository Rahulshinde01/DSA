class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int count1 = 0;
        int element1 = Integer.MIN_VALUE;
        int count2 = 0;
        int element2 = Integer.MIN_VALUE;

        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(count1 == 0 && element2 != nums[i]){
                count1 = 1;
                element1 = nums[i];
            }
            else if(count2 == 0 && element1 != nums[i]){
                count2 = 1;
                element2 = nums[i];
            }
            else if(element1 == nums[i]){
                count1++;
            }
            else if(element2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        int min = len / 3 + 1;

        for(int i = 0; i < len; i++){
            if(nums[i] == element1) count1++;
            if(nums[i] == element2) count2++;
        }

        if(count1 >= min) list.add(element1);
        if(count2 >= min) list.add(element2);

        return list;
    }
}