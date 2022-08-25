class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        // int ans = 0;
        // for(int i=0;i<N;i++){
        //     ans=ans^A[i];
        // }
        // return ans;

        if(N == 0)
            return -1;
   
        if(N == 1)
           return A[0];
           
        int low = 0;
        int high = N-1;
       
        while(low <= high) {
           if(A[low] == A[low+1])
               low += 2;
           else
               return A[low];
           
           if(A[high] == A[high-1])
               high -= 2;
           else
               return A[high];
        }
       
        return -1;
    }
}