class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] dp = new int[k + 1];
        for (int i = cardPoints.length - 1; i >= cardPoints.length - k; i--) {
            dp[0] += cardPoints[i];
        }
        int max_points = dp[0];

        for (int i = 1; i < k + 1; i++) {
            dp[i] = dp[i - 1] + cardPoints[i - 1] - cardPoints[cardPoints.length - k + i - 1];
            max_points = Math.max(max_points, dp[i]);
        }

        return max_points;
    }
}