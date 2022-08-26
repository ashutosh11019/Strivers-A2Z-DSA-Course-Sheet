class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        //add code here.
        int low = 0;
        int high = n-1;
          
        while(low<=high){
            int mid = (low+high)/2;
            if((mid == 0 || arr[mid]>= arr[mid-1]) && (mid == n-1 || arr[mid]>=arr[mid+1])) return mid;
            else if(arr[mid]<=arr[mid+1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
      
        // if(n==1) return 0;
        // for(int i=0;i<n;i++){
        //     if(i==0){
        //         if(arr[i]>arr[i+1]) return i;
        //     }else if(i==n-1){
        //         if(arr[i]>arr[i-1]) return i;
        //     }else{
        //         if(arr[i]>arr[i+1] && arr[i]>arr[i-1]) return i;
        //     }
        // }
        // return 0;
    }
}