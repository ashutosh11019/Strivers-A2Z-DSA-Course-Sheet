class Solution{
    static int subsetXOR(int arr[], int N, int K) {
        // code here
        int max = arr[0];
        for(int i=1;i<N;i++){
            if(arr[i]>max) max = arr[i];
        }
        int m = 10*max;
        int[][] dp = new int[N+1][m+1];
        dp[0][0] = 1;
        for(int i=1;i<=N;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] += dp[i-1][j];
                if((j^arr[i-1]) <= m) dp[i][j] += dp[i-1][j^arr[i-1]];
            }
        }
        return dp[N][K];
    }
}