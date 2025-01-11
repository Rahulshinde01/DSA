class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = Integer.MAX_VALUE;
        int ans = 0;

// without using index
        int diff = 0;
        for(int i = 0; i < len; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }

            diff = prices[i] - buy;
            if(diff > ans){
                ans = diff;
            }
        }

        return ans;
    }
}