class Solution
{
    static int closest3Sum(int A[], int N, int X)
    {
        // code here
        Arrays.sort(A);
        int ans = A[0]+A[1]+A[2];
        for(int i=0;i<=N-3;i++){
            int start=i+1, end=N-1;
            while(start<end){
                int k = A[i]+A[start]+A[end];
                if(k==X) return k;
                if(Math.abs(X-k)<Math.abs(X-ans)) ans=k;
                if(k<X) start++;
                else end--;
            }
        }
        return ans;
    }
}