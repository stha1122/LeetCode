class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        Arrays.sort(nums);
        int idx = 0;
        int curr = 2;
        int prev = 1;
        int prevp = 0;
        int[][] a = new int[0][0];
        for(int i = 0; i < n/3; i++){
            if(nums[curr]-nums[prev] > k || nums[curr]-nums[prevp] > k || nums[prev]-nums[prevp] > k)return a;
            for(int j = 0; j < 3; j++){
                ans[i][j] = nums[idx++];
            }
            curr += 3;
            prev += 3;
            prevp += 3;
        }
        return ans;
    }
}