class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        return (n==0)?false:((n&(n-1)) == 0);
        
    }
    
}