class Solution {
    public boolean canBeValid(String s, String locked) {
        int len = locked.length();
        if(len % 2 != 0){
            return false;
        }
        

        Stack<Integer> open = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();


        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            int val = locked.charAt(i);
            if(ch == '(' && val == '1'){
                open.push(i);
            }
            else if(ch == ')' && val == '1'){
                if(!open.isEmpty()){
                    open.pop();
                }
                else if(!unlocked.isEmpty()){
                    unlocked.pop();
                }
                else{
                    return false;
                }
            }
            else{
                unlocked.push(i);
            }
        }
        while(!open.isEmpty() && !unlocked.isEmpty() && open.peek() < unlocked.peek()){
            open.pop();
            unlocked.pop();
        }

        if(!open.isEmpty()){
            return false;
        }

        return true;
        
    }
}