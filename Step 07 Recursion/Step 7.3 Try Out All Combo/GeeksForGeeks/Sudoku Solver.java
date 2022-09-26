

//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return solve(grid, 0, 0);
    }
    
    static boolean solve(int[][] grid, int i, int j){
        if(i==grid.length) return true;
        int n1=0, n2=0;
        if(j==grid[0].length-1){
            n1=i+1;
            n2=0;
        }else{
            n1=i;
            n2=j+1;
        }
        if(grid[i][j] != 0){
            if(solve(grid, n1, n2)) return true;
        }else{
            for(int k=1;k<=9;k++){
                if(check(grid, i, j, k)){
                    grid[i][j]=k;
                    if(solve(grid, n1, n2)) return true;
                    grid[i][j]=0;
                }
            }
        }
        return false;
    }
    
    static boolean check(int[][] grid, int row, int col, int num){
        for(int i=0;i<grid[0].length;i++){
            if(grid[row][i]==num) return false;
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][col]==num) return false;
        }
        int n1=(row/3)*3;
        int n2=(col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[n1+i][n2+j]==num) return false;
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}