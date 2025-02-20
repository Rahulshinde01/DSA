class MyStack {
    Queue<Integer> main;
    Queue<Integer> helper;
    int size = 0;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();

    }
    
    public void push(int x) {
        main.offer(x);
        size++;
    }
    
    public int pop() {
        int element = -1;
        while(!main.isEmpty()){
            element = main.poll();
            helper.offer(element);
        }

        int count = size;

        while(count  > 1){
            main.offer(helper.poll());
            count--;
        }

        size--;

        return helper.poll();
        
    }
    
    public int top() {
        int element = -1;
        while(!main.isEmpty()){
            element = main.poll();
            helper.offer(element);
        }

        while(!helper.isEmpty()){
            main.offer(helper.poll());
        }

        return element;
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */