class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>(); // for opening bracket index
        stack.push(-1); // for string - ()() bcz if not used it may throw stack index error

        int maxLen = 0;

        for(int i = 0; i < s.length(); i ++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i); // if opening bracket simpty push it
            }else{
                stack.pop(); // after pop we have to calculate the length and if after pop stack is empty then u removed -1 index 
                            // this means that u encouter closing bracket without having opening bracket index in stack
                if(stack.isEmpty()){
                    stack.push(i); // it gives the index of recent invalid paranthesis
                                   // if string is ()))()() 
                    continue;      // go for next itration. can also use !stack.isEmpty()
                }
                maxLen = Math.max(maxLen, i - stack.peek());
            }
        }

        return maxLen;
        
    }
}