class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length)!=(r*c)){
            return mat;
        }
        int [][] result = new int [r][c];
        int res_col=0;
        int res_row=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(res_col==c){
                   res_col=0;
                   res_row++; 
                }
                result[res_row][res_col]=mat[i][j];
                 res_col++;
            }
        }
        return result;
    }
}