class Solution {
    public static int threeSumClosest(int[] nums, int target) {
int n = nums.length;
	
 if (n == 3) {
            return nums[0] + nums[1] + nums[2];
        }

        Arrays.sort(nums); // -4,-2,-1,-1,0,1,2

        
        if (nums[n - 3] + nums[n - 2] + nums[n - 1] <= target){
            return nums[n - 3] + nums[n - 2] + nums[n - 1];
        }
        if (nums[0] + nums[1] + nums[2] >= target){
            return nums[0] + nums[1] + nums[2];
        }





		int closestSum  = nums[0] + nums[1] + nums[2]; 
	    for(int k=0;k<nums.length-2;k++) {
	    	int i=k+1;
	    	int j=nums.length-1;
	    	while(i<j) {
	    		int sum = nums[k]+nums[i]+nums[j];
	    	 if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum; 
                }
	    		
	    		
	    		if(sum>target) {
	    			j--;
	    		}
	    		else  {
	    			i++;
	    		}
	    
	    	}
	    } 
	    return closestSum;
	    }
}