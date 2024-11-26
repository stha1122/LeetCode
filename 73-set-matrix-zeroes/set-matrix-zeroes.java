class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length ;  // row size
        int n = matrix[0].length ; // column size

        boolean firstRowZero = false ;
        boolean firstColumnZero = false ;

        // marking firstColumn
        for(int i=0;i<m;i++){
            //checking first column
            if(matrix[i][0]==0){
                firstColumnZero = true ;
            }
        }
        // marking firstRow 
        for(int j=0;j<n;j++){

            //checking first row
            if(matrix[0][j]==0){
                firstRowZero = true ;
            }            
        }

        // checking inner matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){

                if(matrix[i][j]==0){

                    //mark the first column 
                    matrix[0][j] = 0 ;

                    //mark the first row
                    matrix[i][0] = 0 ;
                    
                }
            }            
        }

        //convert to zeros based on first row,column
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){

                // if first column    OR   first row is zero
                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                     
                    matrix[i][j] = 0 ;    //       
                
                }
            }            
        }

        //convert first row
        if(firstRowZero){
            for(int j=0;j<n;j++){

                matrix[0][j]=0 ;
            }           
        }

        //convert first column
        if(firstColumnZero){
            for(int i=0;i<m;i++){

                matrix[i][0]=0 ;
            }           
        }              
    }
}