class Solution {
    public List<String> stringMatching(String[] words) {

        int len = words.length;

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < len; i++){
            String str = words[i];
            int strLen = str.length();

            for(int j = 0; j < len; j++){
                if(j == i){
                    continue;
                }

                String word = words[j];
                int wordLen = word.length();
                boolean flag = false;

                
                for(int k = 0; k < wordLen; k++){
                    int m = 0; // for str
                    int n = k; // for word
                    while((m < strLen) && (n < wordLen) && (word.charAt(n) == str.charAt(m))){
                        n++;
                        m++;
                    }
                    if(m == strLen){
                        flag = true;
                        ans.add(str);
                        break;
                    }
                }

                if(flag){
                    break;
                }
            }
        }
        return ans;
        
    }
}