class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int lgi=n-1;
        for(int i=n-2;i>=0;i--)
            if(i+nums[i]>=lgi)
                lgi=i;
        return lgi==0;
        
        // int[] dp = new int[nums.length];
        // for(int i=1; i<nums.length; i++) {
        //     dp[i] = Math.max(dp[i-1],nums[i-1])-1;
        //     if(dp[i]<0) return false; 
        // }
        // return true;
    }
}