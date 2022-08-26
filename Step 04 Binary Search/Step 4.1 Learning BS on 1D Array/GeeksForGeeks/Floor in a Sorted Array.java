class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        if(arr[0]>x) return -1;
        int l=0, h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) h=mid-1;
            else l=mid+1;
        }
        return l-1;
    }
    
}