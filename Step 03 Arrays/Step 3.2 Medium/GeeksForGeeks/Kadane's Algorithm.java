class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max=Integer.MIN_VALUE,m=0;
        for(int i=0;i<n;i++){
            m=m+(long)arr[i];
            if(max<m){
                max=m;
            }
            if(m<0){
                m=0;
            }
        }
        
        return max;
    }
    
}