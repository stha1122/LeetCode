class Solution {
  public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    	int q_count = l.length;
        List<Boolean> ans = new ArrayList<>();
    	
    	for(int i=0;i<q_count;i++) {
    		int left = l[i];
    		int right = r[i];
    		int  length = right-left+1;
    		int arr[] = new int[length];
    		for(int k=0,m=left;k<length && m<=right;k++,m++) {
    			arr[k]=nums[m];
    		}
    		
    		ans.add(check(arr));
    	}
    	return ans;
    	
        
    }
	private static boolean check(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int diff = arr[1]-arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-arr[i-1] !=diff) {
				return false;
			}
		}
		return true;
	}
}
