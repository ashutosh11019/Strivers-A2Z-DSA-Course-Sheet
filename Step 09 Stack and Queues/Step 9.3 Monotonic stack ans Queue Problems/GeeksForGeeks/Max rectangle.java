class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int[][] dp = new int[n][m];
        for(int i = 0; i < m; i++) {
            dp[0][i] = M[0][i];
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(M[i][j] != 0)
                    dp[i][j] = M[i][j] + dp[i-1][j];
            }
        }
        
        
        Stack<Integer> s = new Stack<>();
        int maxA = Integer.MIN_VALUE;
        
        for(int i = 0; i < n ; i++) {
            int j = 0;
            int max = Integer.MIN_VALUE;
            while(j < m) {
                if(s.isEmpty() || dp[i][s.peek()] <= dp[i][j]) {
                    s.push(j++);
                } else {
                    int x = s.pop();
                    max = Math.max(max, dp[i][x] * (s.isEmpty() ? j : j - s.peek() - 1));
                }
            }
            while(!s.isEmpty()){
                int x = s.pop();
                max = Math.max(max, dp[i][x] * (s.isEmpty() ? j : j - s.peek() - 1));
            }
            maxA = Math.max(maxA, max);
        }
        return maxA;
    }
}