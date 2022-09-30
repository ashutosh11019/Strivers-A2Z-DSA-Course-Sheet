class Solution {
    public static int longestOnes(int n, int[] nums, int k) {
        // code here
        int i = 0, j;
        for (j = 0; j < n; ++j) {
            if (nums[j] == 0) k--;
            if (k < 0 && nums[i++] == 0) k++;
        }
        return j - i;
    }
}