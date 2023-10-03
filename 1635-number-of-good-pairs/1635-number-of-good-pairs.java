class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] count = new int[120];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int total_count=0;
        for(int i : count){
            total_count+=(i*(i-1))/2;
        }
        return total_count;
    }
}