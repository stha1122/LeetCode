class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_cnt=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt=0;
            }
            else{
                cnt++;
            }  
            max_cnt=Math.max(cnt,max_cnt);
            
            
           }
                  return max_cnt;
    }
}