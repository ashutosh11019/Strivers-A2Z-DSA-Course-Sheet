class Compute {
    public long maxSumWithK(long a[], long n, long k){
        long i=0, j=0, max=Long.MIN_VALUE, sum=0, c=0, b=0;
        while(j<n){
            sum+=a[(int)j];
            if(j-i+1==k){
                max=Math.max(max,sum);
            }
            if(j-i+1>k){
               c+=a[(int)i];
               i++;
               b=Math.min(b,c);
               max=Math.max(max,sum-b);
            }
            j++;
        }
        return max;
    }
}