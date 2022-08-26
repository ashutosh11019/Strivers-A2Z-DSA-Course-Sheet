class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int l=0, r=n-1, mid=0, ans=arr[0];
        while(l<r){
            mid=l+(r-l)/2;
            if(arr[0]<arr[mid]) l=mid+1;
            else r=mid;
        }
        ans=Math.min(ans, arr[mid]);
        if(mid-1 >= 0) ans=Math.min(ans, arr[mid-1]);
        if(mid+1 < n) ans=Math.min(ans, arr[mid+1]);
        return ans;
    }
}