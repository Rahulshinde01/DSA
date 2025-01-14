class Solution {
    public int minimumLength(String s) {
        int len = s.length();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) == 3){
                map.put(ch, 1);
            }
        }

        int ans = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            ans += entry.getValue();
        }

        return ans;
    }
}