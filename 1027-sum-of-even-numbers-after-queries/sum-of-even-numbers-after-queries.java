class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        // get even sum
        int sum = 0;
        for(int n : nums) {
            if(n % 2 == 0) {
                sum += n; 
            }
        }
        
        for(int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            // remove the old number from the query.
            if(nums[q[1]] % 2 == 0) {
                sum -= nums[q[1]];
            }
            // perform the addition
            nums[q[1]] += q[0];
            // add the new value if it's even. 
            if(nums[q[1]] % 2 == 0) {
                sum += nums[q[1]];
            }
            ans[i] = sum; 
        }
        
        return ans; 
    }
}
