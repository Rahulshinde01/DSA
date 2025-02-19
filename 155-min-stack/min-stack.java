import java.util.Stack;

class MinStack {
    private Stack<Long> stack; // Stack to store values
    private long minVal;       // Current minimum value

    public MinStack() {
        stack = new Stack<>();
        minVal = Long.MAX_VALUE; // Initialize minVal to a large value
    }
    
    public void push(int val) {
        long value = val; // Convert to long to handle overflow
        if (stack.isEmpty()) {
            // If the stack is empty, set minVal to the current value
            minVal = value;
            stack.push(value);
        } else {
            if (value < minVal) {
                // If the new value is less than minVal, push a modified value
                stack.push(2 * value - minVal); // Store the modified value
                minVal = value; // Update minVal
            } else {
                // Otherwise, push the value as is
                stack.push(value);
            }
        }
    }
    
    public void pop() {
        long top = stack.pop();
        if (top < minVal) {
            // If the popped value is less than minVal, it was a modified value
            // Restore the previous minVal
            minVal = 2 * minVal - top;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if (top < minVal) {
            // If the top value is less than minVal, it's a modified value
            // The actual top value is minVal
            return (int) minVal;
        } else {
            // Otherwise, return the top value as is
            return (int) top;
        }
    }
    
    public int getMin() {
        return (int) minVal;
    }
}