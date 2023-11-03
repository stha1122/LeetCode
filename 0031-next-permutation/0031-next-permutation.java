class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int dip=-1;
        
        //find dip
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                dip=i;
                break;

            }
        }
        
        //if dip is -1 it means its the least array in permutation .  reverse it simply 
        if(dip==-1){
            reverse(nums,0,n-1);
            return;
        }

        //find number greater than i/dip and swap it
        for(int i=n-1;i>dip;i--){
            if(nums[i] > nums[dip]){
                swap(nums,i,dip);
                break;
            }
        }

        //reverse the remaining elemets
        reverse(nums,dip+1,n-1);
        
    }
     public static void swap(int[] array, int index1, int index2) {
         int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
     }
     public void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}