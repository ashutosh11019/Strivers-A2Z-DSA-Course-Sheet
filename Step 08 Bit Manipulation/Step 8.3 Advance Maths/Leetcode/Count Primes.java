class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++) prime[i]=true;
        for(int i=2;i*i<=n;i++){
            if(prime[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(prime[i]==true) c++;
        }
        return c;
    }
}