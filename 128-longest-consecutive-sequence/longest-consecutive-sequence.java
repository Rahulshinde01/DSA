class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int ans = 1;

        for(int n : set){
            if(!set.contains(n - 1)){
                int cnt = 1;
                n += 1;
                while(set.contains(n)){
                    cnt++;
                    n += 1;
                }

                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
}