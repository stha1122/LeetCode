class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int max_sum=Integer.MIN_VALUE;
       int sum=0;
       for(int i=0;i<k;i++){
           sum+=nums[i];
       }
        max_sum = Math.max(sum,max_sum);
       int s=0,e=k;
       for(int i=e;i<nums.length;i++){
           sum=sum+nums[i]-nums[s];
           max_sum = Math.max(sum,max_sum);
            s++;
       }
       return (double)max_sum/k;
    }
}