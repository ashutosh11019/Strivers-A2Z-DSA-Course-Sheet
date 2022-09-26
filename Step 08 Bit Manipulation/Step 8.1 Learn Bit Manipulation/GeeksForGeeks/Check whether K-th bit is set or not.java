
class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int num=1<<k;
        // System.out.println(num);
        int a=n&num;
        if(a==0) return false;
        return true;
    }
    
}