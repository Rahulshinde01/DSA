class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], i);
        }

        for(int i = nums2.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }

            if(map.containsKey(nums2[i])){
                if(stack.isEmpty()){
                    ans[map.get(nums2[i])] = -1;
                }
                else{
                    ans[map.get(nums2[i])] = stack.peek();
                }
            }
        
            stack.push(nums2[i]);
        }

        return ans;
    }
}