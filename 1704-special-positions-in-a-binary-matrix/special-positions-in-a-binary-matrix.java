class Solution {
    public int numSpecial(int[][] mat) {
        int row_count = mat.length;
        int col_count = mat[0].length;

        int rowArray[] = new int [row_count];
        int colArray[] = new int  [col_count];

        for(int i=0;i<row_count;i++){
            for(int j=0;j<col_count;j++){
                if(mat[i][j]==1){
                    rowArray[i]++;
                    colArray[j]++;
                }
            }
        }
        int output = 0;
         for(int i=0;i<row_count;i++){
            for(int j=0;j<col_count;j++){
                if(mat[i][j]==1){
                   if(rowArray[i]==1 && colArray[j]==1){
                       output++;
                   }
                }
            }
        }

        return output;
    }
}