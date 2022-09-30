class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(long i=0; i<=n/2; i++){
            long index = i*2 + 1;
            if(index < n){
                if(arr[(int)i] < arr[(int)index]){
                    return false;
                }
            }
            if(index + 1 < n){
                if(arr[(int)i] < arr[(int)index + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}