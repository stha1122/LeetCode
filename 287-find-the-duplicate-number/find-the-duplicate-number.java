class Solution {
    public int findDuplicate(int[] nums) {
        boolean seen[] = new boolean[nums.length];
        for(int i:nums){
            if(seen[i]){
                return i;
            }
            else{
                seen[i]=true;
            }
        }
        return -1;
    }
}