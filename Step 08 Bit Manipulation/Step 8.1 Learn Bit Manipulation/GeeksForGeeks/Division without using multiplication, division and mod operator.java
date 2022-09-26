class Solution
{
    public static long divide(long A, long B)
    {
        //code here
        if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
        long a = Math.abs(A), b = Math.abs(B), res = 0;
        for (int x = 31; x >= 0; x--)
            if ((a >>> x) - b >= 0) {
                res += 1 << x;
                a -= b << x;
            }
        return (A > 0) == (B > 0) ? res : -res;
    }
}