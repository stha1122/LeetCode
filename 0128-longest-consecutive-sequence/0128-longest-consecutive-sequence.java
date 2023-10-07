class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){ //if length is 0
            return 0;
        }
        Arrays.sort(nums); //sorted array

        int longestStreak = 1; // number of elements found consecutive
        int currentStreak = 1; // current degree of consecutive numbers

        for(int i=1; i<nums.length ;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    currentStreak+=1;
                }
                else{
                longestStreak = Math.max(longestStreak,currentStreak);
                currentStreak = 1;
                }
            }
        }
        return Math.max(longestStreak,currentStreak); //output is determined by which of the 2 is greater.
    }
}



// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int ali : nums){
//             set.add(ali);
//         }
//         int max=0;
//         for(int ali:nums){
//             if(!set.contains(ali-1)){
//                 int nn=ali;
            
//             int count =0;

//             while(set.contains(nn)){
//                 count++;
//                 nn++;
//             }
//            max= Math.max(count,max);
//         }
//         }
//         return max;
//     }
// }