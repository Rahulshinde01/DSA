class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int len = nums.length;
        int[] temp = new int[len];
        for(int i = 0; i < len; i++){
            temp[i] = nums[i];
        }

        Arrays.sort(temp);

        List<Deque<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int groupIndex = 0;
        map.put(temp[0], groupIndex);
        list.add(new LinkedList<>());
        list.get(groupIndex).offer(temp[0]);
        
        for(int i = 1; i < len; i++){
            if(temp[i] - list.get(groupIndex).peekLast() > limit){
                groupIndex++;
                list.add(new LinkedList<>());
            }
            list.get(groupIndex).offer(temp[i]);
            map.put(temp[i], groupIndex);
        }


        for(int i = 0; i < len; i++){
            int gp = map.get(nums[i]);

            nums[i] = list.get(gp).poll();
        }

        return nums;
    }
}