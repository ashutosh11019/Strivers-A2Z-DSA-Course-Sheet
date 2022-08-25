class Solution {
    public static void swap(int a,int b,int[] nums){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public void nextPermutation(int[] nums) {
        int index=0,c=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i+1;
                c++;
                break;
            }
        }
        if(c==0){
            for(int i=0;i<nums.length/2;i++){
                swap(i,nums.length-i-1,nums);
            }
            return;
        }
        int t=nums[index-1],j=nums.length-1;
        for(;j>=index;j--){
            if(nums[j]>t){
                break;
            }
        }
        swap(j,index-1,nums);
        for(int i=index;i<=(index+nums.length-1)/2;i++){
            swap(i,index+nums.length-1-i,nums);
        }
            
        
    }
}