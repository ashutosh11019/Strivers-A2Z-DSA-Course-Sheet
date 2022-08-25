class Solution {
    public int missingNumber(int[] nums) {
        int m=nums.length;
        for(int i=0;i<nums.length;i++){
            m=m^i^nums[i];
        }
        return m;
        
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(i!=nums[i]) return i;
        // }
        // return nums.length;
    }
}