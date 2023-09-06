class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        //create a (m x n) sized array 
        int [][]matrix=new int[m][n];
        //assign a counter for counting odd numbers    
        int counter=0;
        //traverse the 2D "indices" array 
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<2;j++){
                // increase the matched row in matrix array     
                if(j==0){
                    //integer b shows the row in matrix array    
                    int b=indices[i][j];
                    for(int k=0;k<n;k++){
                        //increase the elements of row in matrix   
                        matrix[b][k]++;
                    }
                }
                //increase the matched column in matrix array 
                if(j==1){
                    //integer b shows the column in matrix array    
                    int b=indices[i][j];
                    for(int l=0;l<m;l++){
                        //increase the elements of column in matrix 
                        matrix[l][b]++;
                    }
                }
            }
        }
        //traverse the matrix array 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //check if the element of array is odd
                //if element is odd increase the counter    
                if(matrix[i][j]%2!=0){
                    counter++;
                }
            }
        } 
        return counter; 
    }
}
