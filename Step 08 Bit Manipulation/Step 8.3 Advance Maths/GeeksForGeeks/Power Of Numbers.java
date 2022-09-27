class Solution
{
    static long mod=1000000007;    
    long power(long N,long R)
    {
        //Your code here
        if(N==1) return 1;
        if(R==0) return 1;
        if(R==1) return N;
        long l;
        if(R%2==0){
            l=power((N*N)%mod,R/2);
        }else{
            l=(N%mod)*power((N*N)%mod,R/2)%mod;
        }
        return l;
    }
    long power(int N,int R)
    {
        //Your code here
        return power((long)N, (long)R);
    }

}