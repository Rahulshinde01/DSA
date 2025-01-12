class Solution {
    // tc = o(n)
    // sc = o(1)
    public boolean canBeValid(String s, String locked) {
        int len = locked.length();
        if(len % 2 != 0){
            return false;
        }
        
        int open = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            int val = locked.charAt(i);
            if(ch == '(' || val == '0'){
                open++;
            }
            else{
                open--;
            }

            if(open < 0){
                return false;
            }
        }

        int close = 0;
        for(int i = len - 1; i >= 0; i--){
            char ch = s.charAt(i);
            int val = locked.charAt(i);
            if(ch == ')' || val == '0'){
                close++;
            }
            else{
                close--;
            }

            if(close < 0){
                return false;
            }
        }
        

        return true;
        
    }
}