class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = Integer.MAX_VALUE;
        int ans = 0;

        int m = -1;
        int n = -1;
        for(int i = 0; i < len; i++){
            if(prices[i] < buy){
                buy = prices[i];
                m = i; 
                n = i;
            }


            if(prices[i] > prices[n]){
                n = i;
                int diff = prices[n] - prices[m];
                ans = Math.max(ans, diff);
            }
        }

        return ans;
    }
}