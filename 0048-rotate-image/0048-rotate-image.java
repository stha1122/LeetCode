class Solution {
    public static  void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
        	for(int j=i;j<matrix[0].length;j++) {
        		Swap(i,j,matrix);
        	}
        }
      
        for(int i=0;i<matrix.length;i++) {
        	reverse(i,matrix);
        }
    }
public static void reverse(int i, int[][] matrix) {
	// TODO Auto-generated method stub
	int start = 0;
	int end = matrix.length-1;
	while(start<end) {
		Swap(i,start,end,matrix);
		start++;
		end--;
	}
}
public static void Swap(int i, int start, int end, int[][] matrix) {
	// TODO Auto-generated method stub
	int temp = matrix[i][start];
	matrix[i][start] = matrix[i][end];
	matrix[i][end] = temp;
	
}
public static void Swap(int a, int b, int[][] matrix) {
	// TODO Auto-generated method stub
	int temp = matrix[a][b];
	matrix[a][b] = matrix[b][a];
	matrix[b][a] = temp;
}
}