class Solution {
    public static void sortColors(int[] nums) {
//		i-0,j-1,k-2
        int i =0,j=0,k=nums.length-1;
        while(j<=k)
        {
        	if(nums[j]==0) {
        		swap(i,j,nums);
        		i++;
        		j++;
        	}
        	else if(nums[j]==2) {
        		swap(j,k,nums);
        		k--;
        		}
        	else {
        		j++;
        	}
        }
    }
	private static void swap(int i, int j, int[] nums) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}