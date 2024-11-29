class Solution {
    public void nextPermutation(int[] nums) {
        int pivot_i=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot_i = i;
                break;
            }
        }

        if(pivot_i == -1){
            reverse(0,nums);
            return;
        }

        for(int i=nums.length-1;i>pivot_i;i--){
            if(nums[pivot_i]<nums[i]){
                swap(pivot_i,i,nums);
                break;
            }
        }

        reverse(pivot_i+1,nums);


    }

    public void swap(int pivot_i,int i,int[] nums){
        int temp = nums[pivot_i];
        nums[pivot_i] =  nums[i];
         nums[i] = temp;
    }

    public void reverse(int pivot_i,int[] nums){
        for(int i=pivot_i,j=nums.length-1;i<j;i++,j--){
            swap(i,j,nums);

        }
    }


}