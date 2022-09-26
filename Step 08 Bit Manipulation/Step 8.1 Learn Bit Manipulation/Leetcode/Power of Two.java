class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n>0){
            if((n&1)==1){
                n=n>>1;
                if(n>0) return false;
            }
            else n=n>>1;
        }
        return true;
    }
}