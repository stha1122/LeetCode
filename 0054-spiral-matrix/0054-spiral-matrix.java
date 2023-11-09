class Solution {
   public static List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> result = new ArrayList<>();
	        if (matrix == null || matrix.length == 0) {
	            return result;
	        }
		 int top = 0;
		 int down = matrix.length-1;
		 int left  = 0;
		 int right = matrix[0].length-1;
		 int row=0;int col=0;
		 while(left <= right && top <= down) {
//			 ---->
//			 ---->
			
			 row = top;
			 for(col = left;col<=right;col++) {
				 result.add(matrix[row][col]);
			 }
			 top++;
//			||
//			||
//			vv
			
			 
			 col=right;
			 for(row = top;row<=down;row++) {
				 result.add(matrix[row][col]);
			 }
			 right--;
//			 <---
//			 <---
			
			 if (top <= down) {
			row=down;
			for(col=right;col>=left;col--) {
				 result.add(matrix[row][col]);
			 }
			 down--;
			 }
//			  ^^
//			  ||
//			  ||
			  

			 if (left <= right) {
			 col = left;
			 for(row=down;row>=top;row--) {
				 result.add(matrix[row][col]);
			 }
			 	left++;
			 }
			 
	
		 }
		 
		return result;
	        
	    }
}