class Solution {
    public int maxProfit(int[] prices) {
       int max_profit =0;
		int l=0,r=1;
		while(r<prices.length) {
			
			
			if(prices[l]<prices[r]) {
				int cur_profit = prices[r]-prices[l]; 
				max_profit=Math.max(max_profit, cur_profit);
				r++;
				}
			else 
			{
			l=r;
			r++;}
		}
		return max_profit;
    }
}