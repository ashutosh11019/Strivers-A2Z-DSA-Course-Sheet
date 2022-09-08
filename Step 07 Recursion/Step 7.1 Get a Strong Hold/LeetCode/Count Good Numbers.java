class Solution {
    private static final int MOD = 1000000007;
    
    public int countGoodNumbers(long n) {
        return (int)(count(n / 2, 4 * 5) * (n % 2 == 0 ? 1 : 5) % MOD);
    }
    
    private long count(long  power, long x) {
        if (power == 0) return 1;
        else if (power % 2 == 0) return count(power / 2, x * x % MOD);
        return x * count(power - 1, x) % MOD;
    }
}