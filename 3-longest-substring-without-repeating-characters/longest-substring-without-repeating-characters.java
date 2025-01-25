class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int j = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                if(map.get(ch) < j){
                    map.put(ch, i);
                    ans = Math.max(ans, i - j + 1);
                    continue;
                }
                j = map.get(ch) + 1;
                map.put(ch, i);
                ans = Math.max(ans, i - j + 1);
            }
            else{
                map.put(ch, i);
                ans = Math.max(ans, i - j + 1);
            }
        }

        return ans;
    }
}