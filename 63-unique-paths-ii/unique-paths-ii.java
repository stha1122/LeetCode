class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int m = Grid.length;
        int n = Grid[0].length;
          t = new int[m][n];
        for (int[] row: t)
            Arrays.fill(row, -1);
        return solve(0,0,m,n,Grid);
    }
      int t[][];
    public int solve(int i,int j,int m,int n,int [][] Grid){
       
        if(i<0 || i>=m || j<0 ||j>=n || Grid[i][j]==1 ){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
        
        int right = solve(i,j+1,m,n,Grid);
        int down = solve(i+1,j,m,n,Grid);
        
        return t[i][j] =  right + down;
    }
}