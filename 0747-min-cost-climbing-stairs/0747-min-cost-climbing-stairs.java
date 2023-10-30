class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        // int memo[]=new int[1001];
        // return(Math.min(solve2(1,cost,memo),solve2(0,cost,memo)));
        return solve3(cost);
    }
	
	public static int solve(int  idx,int cost,int arr[]) {
		if(idx>arr.length) {
			return cost;
		}
		if(idx<=arr.length-1) {
			cost+=arr[idx];
		}
		
		int cost1 = solve(idx+1,cost,arr);
		
		int cost2 = solve(idx+2,cost,arr);
		return Math.min(cost2, cost1);
	}
    
     public static int solve2(int idx, int arr[], int memo[]){
        if(idx>=arr.length) return 0;
        if(memo[idx]!=0) return memo[idx];
        int cost1 = arr[idx]+ solve2(idx+1,arr,memo);
        int cost2 = arr[idx]+ solve2(idx+2,arr,memo);
        memo[idx] = Math.min(cost1,cost2);
        return Math.min(cost1,cost2);

    }
   
    public static int solve3(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<cost.length+1; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }   

}