class Solution{
    static int palindromicPartition(String str){
        // code here
        int n = str.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++) Arrays.fill(dp[i], -1);
        return solve(str, 0, n-1, dp);
    }
    
    static boolean isPalindromic(String str, int i, int j, int[][] dp){
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
    static int solve(String str, int i, int j, int[][] dp){
        if(i>=j || isPalindromic(str, i, j, dp)){
            dp[i][j]=0;
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int left=0, right=0;
            if(dp[i][k] == -1) left=solve(str, i, k, dp);
            else left=dp[i][k];
            if(dp[k+1][j] == -1) right=solve(str, k+1, j, dp);
            else right=dp[k+1][j];
            int temp=1+left+right;
            ans = Math.min(ans, temp);
        }
        return dp[i][j]=ans;
    }
}