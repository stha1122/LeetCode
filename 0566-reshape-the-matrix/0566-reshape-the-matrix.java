// class Solution {
//     public int[][] matrixReshape(int[][] mat, int r, int c) {
//         if((mat.length*mat[0].length)!=(r*c)){
//             return mat;
//         }
//         int [][] result = new int [r][c];
//         int res_col=0;
//         int res_row=0;
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 if(res_col==c){
//                    res_col=0;
//                    res_row++; 
//                 }
//                 result[res_row][res_col]=mat[i][j];
//                  res_col++;
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++)
            res[i / c][i % c] = nums[i / m][i % m];
        return res;
    }
}