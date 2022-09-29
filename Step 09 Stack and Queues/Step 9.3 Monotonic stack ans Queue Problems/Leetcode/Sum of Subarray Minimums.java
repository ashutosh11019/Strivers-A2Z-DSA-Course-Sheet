class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] dp = new int[arr.length];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) s.pop();
            if (s.isEmpty()) dp[i] = (i + 1) * arr[i];
            else dp[i] = dp[s.peek()] + (i - s.peek()) * arr[i];
            total = (total + dp[i] ) % 1000000007;
            s.push(i);
        }
        return total;
    }
}