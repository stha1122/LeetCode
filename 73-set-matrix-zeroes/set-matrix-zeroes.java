class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int temp [][] = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                      temp[i][j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(temp[i][j]==1){
                      solve(matrix,i,j);
                }
            }
   
          }
    }

    public void solve(int [][] matrix,int i,int j){
         int n = matrix.length;
        int m = matrix[0].length;
        for(int p=0;p<n;p++){
            matrix[p][j]=0;
        }
        for(int p=0;p<m;p++){
            matrix[i][p]=0;
        }
    }
}