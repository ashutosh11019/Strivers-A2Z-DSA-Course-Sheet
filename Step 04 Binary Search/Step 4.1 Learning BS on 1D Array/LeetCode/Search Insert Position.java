class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]>target){
                r=m-1;
            }else if(nums[m]<target){
                l=m+1;
                index=l;
            }else if(nums[m]==target){
                index=m;
                break;
            }
        }
        return index;
    }
}