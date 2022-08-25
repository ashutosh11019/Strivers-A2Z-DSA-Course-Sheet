class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c=Math.max(c,count);
                count=0;
                
            }else{
                count++;
            }
            
        }
        c=Math.max(c,count);
        return c;
    }
}