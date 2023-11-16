// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         // Arrays.sort(nums);
//         for(int i=0; i<nums.length; i++){
//             while(nums[i] != i+1 && nums[nums[i] - 1] != nums[i]){
//                 swap(nums, i, nums[i]-1);
//             }
//         }
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] != i+1){
//                 return new int[]{nums[i], i + 1};
//             }
//         }
//         return null;
//     }

//     private void swap(int[] nums, int i, int j){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }

class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] n = new boolean[nums.length+1];
        int[] ans = new int[2];
        for(int num : nums){
            if(n[num]){
                ans[0] = num;
            }
            n[num] = true;
        }
        for(int i=1; i<=nums.length; i++){
            if(!n[i]){
                ans[1]=i;
            }
        }
        return ans;
    }
}