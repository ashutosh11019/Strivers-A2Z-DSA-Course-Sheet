class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int B)
    {
        //Your code here
        if (B > A.length) return -1;
        int low = A[0];
        int high = 0;
        for (int i = 0; i < A.length; i++) {
            high = high + A[i];
            low = Math.min(low, A[i]);
        }
        int res = -1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (isPossible(A, mid, B)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    static boolean isPossible(int[] A, int pages, int students) {
        int cnt = 0;
        int sumAllocated = 0;
        for (int i = 0; i < A.length; i++) {
            if (sumAllocated + A[i] > pages) {
                cnt++;
                sumAllocated = A[i];
                if (sumAllocated > pages) return false;
            } else {
                sumAllocated += A[i];
            }
        }
        if (cnt < students) return true;
        return false;
    }
};