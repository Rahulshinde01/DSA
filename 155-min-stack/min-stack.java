class MinStack {
    Stack<Integer> stack;
    Stack<Integer> helper;


    public MinStack() {
        stack = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int val) {
        if(helper.isEmpty() || val <= helper.peek()){
            helper.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int val = stack.pop();

            if(val == helper.peek()){
                helper.pop();
            }
        }
        
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }

        return -1;
        
    }
    
    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }

        return -1;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */