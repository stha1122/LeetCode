class Solution {
    public int trap(int[] arr) {
        	
	
        int left_max[]= new int[arr.length];
        int right_max[]= new int[arr.length];
		int watertrapped=0;
		
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
          left_max[i]=max;}
        

          max = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            max = Math.max(arr[i],max);
          right_max[i]=max;}

for(int i=0;i<arr.length;i++){
    watertrapped += Math.min(left_max[i]-arr[i],right_max[i]-arr[i]);
}



        // for(int i=0;i<arr.length;i++) {
		// 	int left=0,right=0;
		// 	for(int j=0;j<=i;j++) {
		// 		left=Math.max(left, arr[j]);
		// 	}
		// 	for(int j=i;j<arr.length;j++) {
		// 		right=Math.max(right, arr[j]);
		// 	}
		// 	watertrapped+=Math.min(left, right)-arr[i];
			

		return watertrapped;

		
		}  
}
