class Solution {
    int R;
    int C;
    int[] buffer;
    
    public int[][] diagonalSort(int[][] mat) {
        R = mat.length;
        C = mat[0].length;
        
        buffer = new int[Math.min(R,C)];
        
        for (int r = 0; r < R; r++) {
            sortDiagonal(r, 0, mat);
        }
        
        for (int c = 1; c < C; c++) {
            sortDiagonal(0, c, mat);
        }
        
        return mat;
    }
        
    private void sortDiagonal(int startR, int startC, int[][] mat) {
        int r = startR;
        int c = startC;
        int bPtr = 0;
        while (r < R && c < C) {
            buffer[bPtr++] = mat[r++][c++];
        }
        Arrays.sort(buffer, 0, bPtr);
        for (int i = 0; i < bPtr; i++) {
            mat[startR+i][startC+i] = buffer[i];
        }
    }
}