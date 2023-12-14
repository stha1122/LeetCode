class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[]= new int[grid.length];
        int col[]= new int[grid[0].length];
        for(int i=0; i<row.length; i++){
            int one=0;
            for(int j=0; j<col.length; j++){
                one = one + grid[i][j];
            }
            row[i]= (2*one)-(row.length);
        }

        for(int j=0; j<col.length; j++){
            int one=0;
            for(int i=0; i<row.length; i++){
                one = one + grid[i][j];
            }
            col[j]= (2*one)-(col.length);
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                grid[i][j]= row[i]+col[j];
            }
        }
        return grid;
    }
}