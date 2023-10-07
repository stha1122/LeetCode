class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ali : nums){
            set.add(ali);
        }
        int max=0;
        for(int ali:nums){
            if(!set.contains(ali-1)){
                int nn=ali;
            
            int count =0;

            while(set.contains(nn)){
                count++;
                nn++;
            }
           max= Math.max(count,max);
        }
        }
        return max;
    }
}