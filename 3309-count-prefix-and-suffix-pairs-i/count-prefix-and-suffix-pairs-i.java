class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length;
        int ans = 0;
        for(int i = 0; i < len; i++){
            String str = words[i];
            int strLen = str.length();
            for(int j = i + 1; j < len; j++){
                String word = words[j];
                int wordLen = word.length();
                boolean flag = false;
                if(strLen <= wordLen){
                    
                    int m = 0; // for str
                    int n = 0;
                    while((m < strLen) && (str.charAt(m) == word.charAt(n))){
                        m++;
                        n++;
                    }

                    boolean f1 = false;
                    if(m == strLen){
                        f1 = true;
                    }

                    m = strLen - 1;
                    n = wordLen - 1;
                    while((m >= 0) && (str.charAt(m) == word.charAt(n))){
                        m--;
                        n--;
                    }

                    boolean f2 = false;
                    if(m == -1){
                        f2 = true;
                    }

                    flag = f1 && f2;
                }

                if(flag){
                    ans++;
                }
               
                
            }
        }

        return ans;
    }
}