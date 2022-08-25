class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        k=k%n;
        int low=0;
        int high=k-1;
        while(low<high)
        {
            long temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        low=k;
        high =n-1;
        while(low<high)
        {
            long temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        low=0;
        high = n-1;
        while(low<high)
        {
            long temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}