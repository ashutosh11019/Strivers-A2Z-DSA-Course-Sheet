class Solution
{
    public void  MakeZeros(int[][] matrix)
    {
        // code here
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    int sum=0;
                    if(i+1<n){
                        sum+=matrix[i+1][j];
                        mat[i+1][j]=-1;
                    }
                    if(i-1>=0){
                        sum+=matrix[i-1][j];
                        mat[i-1][j]=-1;
                    }
                    if(j+1<m){
                        sum+=matrix[i][j+1];
                        mat[i][j+1]=-1;
                    }
                    if(j-1>=0){
                        sum+=matrix[i][j-1];
                        mat[i][j-1]=-1;
                    }
                    mat[i][j]=sum;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==-1) matrix[i][j]=0;
                else if(mat[i][j]>0) matrix[i][j]=mat[i][j];
            }
        }
    }
}