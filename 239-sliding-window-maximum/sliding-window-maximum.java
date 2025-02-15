class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[nums.length - k + 1];

        for(int i = 0; i < k; i++){

            while(!dq.isEmpty() && dq.peekLast() < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
        }

        arr[0] = dq.peekFirst();

        for(int i = 1; i <= nums.length - k; i++){
            if(nums[i - 1] == dq.peekFirst()){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && dq.peekLast() < nums[k - 1 + i]){
                dq.pollLast();
            }
            dq.offerLast(nums[k - 1 + i]);

            arr[i] = dq.peekFirst();
        }

        return arr;
    }
}