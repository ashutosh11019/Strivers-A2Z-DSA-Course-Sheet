class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int l=1;
        int u=m;
        while(l<=u){
            int mid=(l+u)/2;
            double pro=Math.pow(mid,n);
            if(pro == m){
                return mid;
            }
            else if(pro>m){
                u=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    
    
        // if(n==0) return m;
        // for(int i=1; i<=m; i++){
        //     if(Math.pow(i,n) == m) return i;
        //     else if(Math.pow(i,n) > m) return -1;
        // }
        // return -1;
    }
}