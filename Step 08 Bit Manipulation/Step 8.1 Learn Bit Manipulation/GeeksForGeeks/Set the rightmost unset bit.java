class Solution{
    static int setBit(int N){
        // code here
        int c=0, n=N;
        while(n>0){
            if((n&1)==0){
                N+=(int)Math.pow(2,c);
                break;
            }
            c++;
            n=n>>1;
        }
        return N;
    }
}