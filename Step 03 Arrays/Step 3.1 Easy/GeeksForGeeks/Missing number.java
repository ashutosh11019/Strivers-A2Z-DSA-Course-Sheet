class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        // Your code goes here
        int xorr=0;
        for(int i=0;i<N-1;i++)
            xorr=xorr^A[i];
        for(int i=1;i<=N;i++)
            xorr=xorr^i;
        return xorr;
    }
}