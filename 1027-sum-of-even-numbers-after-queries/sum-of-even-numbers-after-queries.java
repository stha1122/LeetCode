class Solution {
     public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		 int total_sum=0;
		 int ans[] = new int[queries.length];
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]%2==0) {
				 total_sum+=nums[i];
			 }
		 }
		 
		 for(int i=0;i<queries.length;i++) {
			 if(nums[queries[i][1]]%2==0) {
				total_sum-= nums[queries[i][1]];
			 }
			
			 nums[queries[i][1]]+=queries[i][0];
				
			 if(nums[queries[i][1]]%2==0) {
					total_sum+= nums[queries[i][1]];
				 }
			 ans[i] =total_sum;
			 
		 }
		return ans;
	        
	    }
}