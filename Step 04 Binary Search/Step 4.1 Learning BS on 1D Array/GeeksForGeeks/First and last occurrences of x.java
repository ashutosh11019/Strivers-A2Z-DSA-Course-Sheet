class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> a = new ArrayList<Long>();
        long f=-1,l=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                f=mid;
                high=mid-1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                l=mid;
                low=mid+1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        a.add(f);
        a.add(l);
        return a;
    }
}