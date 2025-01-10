class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int len1 = words1.length;
        int len2 = words2.length;

        int[] freq = new int[26];
        for(int i = 0; i < len2; i++){

            int[] temp = new int[26];
            String str = words2[i];
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                int ind = ch - 'a';

                temp[ind]++;

                freq[ind] = Math.max(temp[ind], freq[ind]);
            }
        }

        

        
        for(int i = 0; i < len1; i++){
            int[] freq2 = new int[26];
            String str = words1[i];
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);

                freq2[ch - 'a']++;
            }


            int j = 0;
            while(j < 26){
                if(freq2[j] < freq[j]){
                    break;
                }

                j++;                
            }
            if(j == 26){
                ans.add(str);
            }
        }

        return ans;
    }
}