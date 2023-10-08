class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        
    int n = nums1.length;
    int m = nums2.length;
    
    // Create a 2D DP array to store the maximum dot product
    int[][] dp = new int[n][m];
    
    // Initialize the DP array
    dp[0][0] = nums1[0] * nums2[0];
    
    // Fill in the first row of DP array
    for (int j = 1; j < m; j++) {
        dp[0][j] = Math.max(dp[0][j - 1], nums1[0] * nums2[j]);
    }
    
    // Fill in the first column of DP array
    for (int i = 1; i < n; i++) {
        dp[i][0] = Math.max(dp[i - 1][0], nums1[i] * nums2[0]);
    }
    
    // Fill in the rest of the DP array
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            // Calculate the dot product of subsequences ending at i and j
            int product = nums1[i] * nums2[j];
            
            // Decide whether to include the current elements in the subsequences or not
            dp[i][j] = Math.max(product, Math.max(dp[i - 1][j - 1] + product, Math.max(dp[i - 1][j], dp[i][j - 1])));
        }
    }
    
    return dp[n - 1][m - 1];
    }
}