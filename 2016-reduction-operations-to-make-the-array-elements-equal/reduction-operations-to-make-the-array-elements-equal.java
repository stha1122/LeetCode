class Solution {
    public int reductionOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int previous = nums[0];
        int ans=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=previous){
                ans+=n-i;
                previous = nums[i];
            }
        }
        return ans;
    }
}