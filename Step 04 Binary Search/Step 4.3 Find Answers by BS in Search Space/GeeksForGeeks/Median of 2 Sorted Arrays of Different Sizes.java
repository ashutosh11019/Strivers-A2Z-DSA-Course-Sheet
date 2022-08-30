class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int arr[]=new int[n+m];
        System.arraycopy(a,0,arr,0,n);
        System.arraycopy(b,0,arr,n,m);
        Arrays.sort(arr);
        int size=arr.length;
        if(size%2==0){
           int z=size/2;
           int e=arr[z];
           int q=arr[z-1];
           double ans=(double)(e+q)/2;
           return ans;
        }else{
           int z=Math.round(size/2);
           return arr[z];
        }
        
    }
}