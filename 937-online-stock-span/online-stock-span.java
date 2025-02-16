class StockSpanner {
    Stack<Integer> stack; // for price
    Stack<Integer> special; // for days 

    public StockSpanner() {
        stack = new Stack<>();
        special = new Stack<>();
        
    }
    
    public int next(int price) {
        int ans = 1; // as today is included
        while(!stack.isEmpty() && stack.peek() <= price){ // as per the codition required
            stack.pop();
            ans += special.pop(); // finding answer

        }
        stack.push(price); // maintaining the decreasing stack of price
        special.push(ans); // days coresponds to price

        return ans; // returning days
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */