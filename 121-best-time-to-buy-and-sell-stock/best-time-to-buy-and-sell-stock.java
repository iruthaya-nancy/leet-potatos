class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        for(int i = 1;i<prices.length;i++){
            
            maxProfit = Math.max(maxProfit,prices[i]-minSoFar);
        
            minSoFar = Math.min(minSoFar,prices[i]);
        }
        return maxProfit;
    }
}