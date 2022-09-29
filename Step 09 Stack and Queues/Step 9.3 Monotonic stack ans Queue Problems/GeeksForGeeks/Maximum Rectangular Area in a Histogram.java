class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long N) 
    {
        // your code here
        int n = (int)N;
        long[] left = new long[n];
        long[] right = new long[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && hist[st.peek()] >= hist[i]) {
                st.pop();
            }
            if (st.isEmpty()) left[i] = 0;
            else left[i] = st.peek() + 1;
            st.push(i);
        }
        while (!st.isEmpty()) st.pop();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && hist[st.peek()] >= hist[i]) {
                st.pop();
            }
            if (st.isEmpty()) right[i] = n - 1;
            else right[i] = st.peek() - 1;
            st.push(i);
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, hist[i] * (right[i] - left[i] + 1));
        }
        return max;
    }
        
}