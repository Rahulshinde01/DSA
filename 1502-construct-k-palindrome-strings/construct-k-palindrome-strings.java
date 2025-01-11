class Solution {
    public boolean canConstruct(String s, int k) {
        int len = s.length();
        if(k > len){
            return false;
        }
        if(k == len){
            return true;
        }

        int[] arr = new int[26];

        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }

        return (count <= k);
        
    }
}