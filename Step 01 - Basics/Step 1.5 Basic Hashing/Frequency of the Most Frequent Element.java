class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        long[] prefix = new long[len];
        prefix[0] = nums[0];
        for(int i = 1;i<len;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
        int max = 1;
        for(int i = len-1;i>0;i--){
            int lo = 0,hi = i;
            while(lo<=hi){
                int mid = hi - (hi-lo)/2;
                long sum = prefix[i] - (mid>0?prefix[mid-1]:0);
                if(sum+k >= nums[i]*1l*(i-mid+1)){
                    max = Math.max(max,i-mid+1);
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
        }
        return max;
    }
}