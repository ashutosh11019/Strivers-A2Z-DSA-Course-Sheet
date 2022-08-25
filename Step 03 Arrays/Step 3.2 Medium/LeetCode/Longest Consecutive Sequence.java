class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int num: hs){
            if (!hs.contains(num - 1)) {
                int cur = num;
                int count = 1;

                while (hs.contains(cur + 1)) {
                    cur++;
                    count++;
                }

                c = Math.max(c, count);
            }
        }
        return c;
    }
}