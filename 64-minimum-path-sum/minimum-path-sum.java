class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length-1;
        int m = grid[0].length-1;
     
        for(int j=0,i=1;i<=n;i++){
            grid[i][j]+=grid[i-1][j];
        }
    
        for(int i=0,j=1;j<=m;j++){
            grid[i][j]+=grid[i][j-1];
        }

         for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
    return grid[n][m];
    
    }
}