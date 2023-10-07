class Solution {
    public int numOfArrays(int n, int m, int k) {
        if (k == 0)
            return 0;
        int mod = 1_000_000_007;
        
        int[][] curr = new int[k+1][m+1];
        int[][] prev = new int[k+1][m+1];
        Arrays.fill(prev[0], 1);
        
        for (int j = 0; j < n; j++) {
            for (int cost = k; cost >= 0; cost--) {
                int sum = 0;
                for (int max = m; max >= 0; max--) {
                    curr[cost][max] = 0;
                    if (cost > 0) {
                        curr[cost][max] += sum;
                        curr[cost][max] %= mod;
                        sum += prev[cost-1][max];
                        sum %= mod;
                    }
                    curr[cost][max] += (int)(((((long)max)*((long)prev[cost][max]))) % mod);
                    curr[cost][max] %= mod;
                }
            }
            int[][] temp = curr;
            curr = prev;
            prev = temp;
        }
        
        return (int)prev[k][0];
    }
}