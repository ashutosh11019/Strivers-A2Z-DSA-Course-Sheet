class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int arr[] = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                arr[j]=0;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==1){
                arr[j]=1;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==2){
                arr[j]=2;
                j++;
            }
        }
        
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
    }
}