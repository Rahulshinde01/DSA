class Solution {
    public int minimumLength(String s) {
        int n = s.length();

        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch-'a'] += 1;

            if(freq[ch - 'a'] == 3){
                freq[ch - 'a'] = 1;
            }
        }

        int result = 0;

        for(int i = 0; i < 26; i++) {
            result += freq[i];
        }

        return result;
    }
}