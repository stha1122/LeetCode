class Solution {
   public static void nextPermutation(int[] nums) {
        int ele_index = -1;
        int n = nums.length-1;
        for(int i=n;i>0;i--) {
        	if(nums[i-1]<nums[i]) {
        		ele_index = i-1;
        		break;
        	}
        }
        
 
        if(ele_index == -1){
            Arrays.sort(nums);
            return;
        }

      
        for(int i=nums.length-1;i>0;i--) {
        	if(nums[i]>nums[ele_index]) {
        		int temp = nums[ele_index];
        	        nums[ele_index] = nums[i];
        	        nums[i] = temp;
        		    break;
        	}
        	
        }
        int start = ele_index+1;
        int end = n;
        while(start<=end) {
        	int temp = nums[start];
        	nums[start] = nums[end];
        	nums[end] = temp;
        	start++;
        	end--;
        	}
     
    }

}