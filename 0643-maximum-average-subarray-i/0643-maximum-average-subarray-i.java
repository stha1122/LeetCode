class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sm=0;
        for(int i=0;i<k;i++) sm+=nums[i];
        int i=k;
        int j=0;
        double avg=sm/(double)k;
        while(i<nums.length){
            sm+=nums[i];
            sm-=nums[j];
            avg=Math.max(avg,sm/(double)k);
            i++;
            j++;
        }
        return avg;
    }
}