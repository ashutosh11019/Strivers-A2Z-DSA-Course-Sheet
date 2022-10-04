class Solution {
    
    static int[] memory;

    static int canReach(int[] A, int N) {
        memory = new int[N];
        Arrays.fill(memory, -1);
        return helper(A, N, 0);
    }

    private static int helper(int[] a, int n, int i) {
        if (i >= n - 1) return memory[i] = 1;
        if (memory[i] != -1) return memory[i];
        for (int j = 1; j <= a[i]; j++)
            if (helper(a, n, i + j) == 1) return memory[i] = 1;
        return memory[i] = 0;
    }
    
};