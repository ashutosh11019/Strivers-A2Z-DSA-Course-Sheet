class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        Long[][] dp = new Long[n][n];
        for(int i=0;i<n;i++) Arrays.fill(dp[i], 1L);
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                dp[i][j]=(dp[i-1][j]+dp[i-1][j-1])%1000000007;
            }
        }
        ArrayList<Long> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(dp[n-1][i]);
        }
        return ans;
    }
}