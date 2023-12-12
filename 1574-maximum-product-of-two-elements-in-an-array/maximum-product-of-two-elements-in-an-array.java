class Solution {
    public int maxProduct(int[] nums) {
       
       int Largest = nums[0];
       int secondLargest =  nums[1];

        if(Largest<secondLargest){
            int temp = Largest;
            Largest = secondLargest;
            secondLargest = temp;
        }

        for(int i=2;i<nums.length;i++){
                if(nums[i]>Largest){

                    secondLargest = Largest;
                    Largest = nums[i];
            
                }
                else if(nums[i]>secondLargest){
                    secondLargest = nums[i];
                }
        }

        return ((Largest-1)*(secondLargest-1));

    }
}