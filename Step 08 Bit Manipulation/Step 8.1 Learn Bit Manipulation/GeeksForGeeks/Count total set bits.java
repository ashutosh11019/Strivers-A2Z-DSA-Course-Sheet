class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        if(n==0) return 0;
        
        int x= (int)(Math.log(n)/ Math.log(2));
        
        return ( ((int)Math.pow(2,x-1)*x) + (n- (int)Math.pow(2,x) +1) + countSetBits(n-(int)Math.pow(2,x)));
        
    }
}