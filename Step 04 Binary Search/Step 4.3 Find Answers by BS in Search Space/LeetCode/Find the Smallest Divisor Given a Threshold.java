class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1, high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high = Math.max(high, nums[i]);
        }
        
        int ans=0;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(help(nums, mid) <= threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    
    public static int help(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(Math.ceil((double) nums[i]/mid));
        }
        return sum;
    }
}