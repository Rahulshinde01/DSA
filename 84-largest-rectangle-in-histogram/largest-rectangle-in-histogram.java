class Solution {
    public int largestRectangleArea(int[] heights) {
        // riddhi wala approach :-
        
        Stack<Integer> stack = new Stack<>(); //maintain index of increasing bar heights
        int n = heights.length;
        int maxArea = 0;
        for(int i = 0; i < heights.length; i ++){
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){ //  heights[stack.peek()] > heights[i] -> helps in maintaining the increasing height index
                int index = stack.pop(); // index of bar whose area we need to calculate
                int left = stack.isEmpty() ? -1 : stack.peek(); // smaller height including current bar to its left 
                int right = i; // smaller height including current bar to its right
                int width = (right - left - 1); 
                int area = heights[index] * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            int left = stack.isEmpty() ? -1 : stack.peek();
            int right = n; // as no bar to its right whose height is smaller than the current index bar height 
            int width = (right - left - 1);
            int area = heights[index] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
        
    }
}