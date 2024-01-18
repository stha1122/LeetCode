class Solution {
    public int climbStairs(int n) {
        
	return solveBU(n);
	
    }
  public static int solveBU(int dest) {
		int[] dp = new int[dest+2];
		
		dp[dest]=1;
		for(int curr=dest-1;curr>=0;curr--) {
			int sp1 = dp[curr+1];
			int sp2 = dp[curr+2];
			dp[curr] = sp1 + sp2;
		}
		return dp[0];
	}
}