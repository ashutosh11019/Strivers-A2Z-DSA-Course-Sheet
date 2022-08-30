class Complete{
    int KthMissingElement(int a[], int n, int k)
    {
        // Complete the function
        int i=0, j=n;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(a[mid]-(mid+1) >= k) i=mid;
            else j=mid+1;
        }
        return i+k;
    }
}
