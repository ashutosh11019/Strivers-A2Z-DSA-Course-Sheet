class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i])
            {
                  ans[0]=arr[i];
                  break;
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]+1 !=arr[i+1] && arr[i]!=arr[i+1])
            {
                ans[1]=arr[i]+1;
                break;
            }
        }
        if(arr[0]!=1)
            ans[1]=1;
        if(ans[1]==0)
            ans[1]=arr[n-1]+1;
        return ans;
    }
}