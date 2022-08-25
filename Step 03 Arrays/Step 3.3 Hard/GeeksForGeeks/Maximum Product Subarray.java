class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long max=arr[0];
        long min=arr[0];
        long ans=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                long temp=min;
                min=max;
                max=temp;
            }
            max=Math.max(arr[i], arr[i]*max);
            min=Math.min(arr[i], arr[i]*min);
            ans=Math.max(ans, max);
        }
        return ans;
    }
}