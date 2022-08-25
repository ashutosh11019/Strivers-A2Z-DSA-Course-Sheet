class Solution {
    private void reverse(int[] nums, int i, int j) {
        int t;
        while(i < j) {
            t = nums[i];
            nums[i++] = nums[j];
            nums[j--] = t;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int finalK = n - (k % n);
        reverse(nums, 0, finalK-1);
        reverse(nums, finalK, n-1);
        reverse(nums, 0, n-1);
    }
}