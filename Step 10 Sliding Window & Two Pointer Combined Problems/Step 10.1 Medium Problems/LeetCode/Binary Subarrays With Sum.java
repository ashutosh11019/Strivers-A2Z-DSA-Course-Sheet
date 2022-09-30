class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int low=0, high=0, ans=0, sum=0, s=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(low<i && sum>goal){
                sum-=nums[low];
                low++;
            }
            s+=nums[i];
            while(high<i && (s>goal || s==goal && nums[high]==0)){
                s-=nums[high];
                high++;
            }
            if(sum==goal) ans+=(high-low+1);
        }
        return ans;
    }
}