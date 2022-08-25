class Sol
{
   public static int matSearch(int mat[][], int N, int M, int X)
   {
       // your code here
       
       for(int i=0;i<mat.length;i++)
       {
           int low=0, high=mat[0].length-1;
           while(low<=high)
           {
               int mid=(low+high)/2;
               if(mat[i][mid]==X)
                 return 1;
               else if(mat[i][mid]<X)
               {
                   low=mid+1;
               }
               else if(mat[i][mid]>X)
               {
                   high=mid-1;
               }
           }
       }
       return 0;
   }
}