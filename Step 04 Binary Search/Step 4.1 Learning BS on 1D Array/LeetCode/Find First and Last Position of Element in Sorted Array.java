class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]=-1;
        arr[1]=-1;
        
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                high=mid-1;
            }else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        
        low=0; 
        high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                low=mid+1;
            }else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        
        return arr;
    }
}