class Solution {
    public boolean search(int[] nums, int target) {
        int l=0, r=nums.length-1, mid; 
        while(l<=r){
            mid = l + (r-l)/2;
            if(nums[mid]==target)return true;
            else if(nums[mid]<target){
                if(nums[mid]<nums[r]){ 
                    if(nums[r]>=target)l=mid+1;
                    else r=mid-1;
                }
                else if(nums[mid]>nums[r])l=mid+1;
                else r--;
            }
            else{
                if(nums[mid]>nums[r]){
                    if(nums[l]<=target)r=mid-1;
                    else l=mid+1;
                }
                else if(nums[mid]<nums[r])r=mid-1;
                else r--;
            }
        }
        return false;
    }
}