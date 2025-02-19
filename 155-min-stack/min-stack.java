class MinStack {
    long minVal; // reason for using long is in line no 28 and 29
    List<Long> list;
    int size;

    public MinStack() {
        minVal = Integer.MAX_VALUE + 1L;
        list = new ArrayList<>();
        size = 0;
        
    }
    
    public void push(int val) {
        long toBePushed = val;
        if(val < minVal){
            toBePushed = 2 * (long)val - minVal; // here y = toBePushed and x = val
            minVal = val;
        }
        list.add(toBePushed);
        size ++;
        
    }
    
    public void pop() {
        long element = list.get(size - 1);
        if(element < minVal){
            minVal = 2 * (long)minVal - element; //here  y = element
            // why we need long type data member(i.e minVal) => 
            // reason - the above calculation of minVal can lead to having number less than Integer.MIN_VALUE
        }
        list.remove(size - 1);
        size --;
        
    }
    
    public int top() {
        long element = list.get(size - 1);
        if(element < minVal){
            element = minVal; // returning the actual peek value
        }
        return (int)element;
        
    }
    
    public int getMin() {
        return (int)minVal;
        
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