class Solution {
    public int maxProduct(int[] nums) {
       
        Arrays.sort(nums);
         int num1 = nums[nums.length-1];
        int num2 = nums[nums.length-2];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>=num1){
        //         num2 = num1;
        //         num1 = nums[i];
                
        //     }
        // }
        return (num1-1)*(num2-1);
    }
}