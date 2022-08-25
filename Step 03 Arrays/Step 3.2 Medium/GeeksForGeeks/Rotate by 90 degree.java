class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        
        int temp[] = new int[n];
        for(int i=0;i<n/2;i++){
            temp=ans[i];
            ans[i]=ans[n-i-1];
            ans[n-i-1]=temp;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}