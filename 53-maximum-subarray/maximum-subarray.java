class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE,sum=0;

        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            max_sum = Math.max(sum,max_sum);
        }

        return max_sum;
    }
}