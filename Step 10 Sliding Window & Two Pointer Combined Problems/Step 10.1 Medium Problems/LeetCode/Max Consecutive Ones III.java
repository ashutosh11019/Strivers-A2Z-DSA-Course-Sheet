class Solution {
    public int longestOnes(int[] nums, int k) {
        int length = 0;

        int zerosCount = 0;

        int start = 0;
        for (int end = 0; end < nums.length; end++) {

            if (nums[end] == 0) zerosCount += 1;

            if (zerosCount > k && start <= end) {
                if (nums[start] == 0) zerosCount -= 1;
                start += 1;
            }
            length = Math.max(length, end - start + 1);
        }
        return length;
    }
}