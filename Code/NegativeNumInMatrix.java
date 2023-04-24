
//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, 
//return the number of negative numbers in grid.

 
class NegativeNumInMatrix{
        public int countNegatives(int[][] grid) {
        int count=0; // initializes the count to 0
        for(int i =0 ;i<grid.length;i++){ // loops through the rows
            for(int j=0 ;j<grid[i].length;j++){ // loops through the columns
                if(grid[i][j]<0){ // checks if the element is negative
                    count++; // if it is negative, increments the count
                }
            }
        }
        return count;
    }
   
}