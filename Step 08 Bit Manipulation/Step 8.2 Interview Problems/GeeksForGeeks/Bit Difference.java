class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int t=a^b;
        int c=0;
        while(t!=0){
            int r=t & -t;
            t-=r;
            c++;
        }
        return c;
    }
    
    
}