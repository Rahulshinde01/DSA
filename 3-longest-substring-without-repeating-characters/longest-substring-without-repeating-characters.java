class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        Set<Character> set = new HashSet<>();
        int ans = 0;
        int j = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                while(s.charAt(j) != ch){
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
                
            }
            else{
                ans = Math.max(ans, i - j + 1);
                set.add(ch);
            }
        }

        ans = Math.max(ans, len - j);

        return ans;
    }
}