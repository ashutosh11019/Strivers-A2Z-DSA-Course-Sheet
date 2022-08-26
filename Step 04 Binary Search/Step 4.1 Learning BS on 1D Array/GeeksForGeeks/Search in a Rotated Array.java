class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
        int index=0;
        for(int i=0;i<h;i++){
            if(A[i]>A[i+1]){
                index=i;
                break;
            }
        }
        int low=l,high=index;
        while(low<=high){
            int mid=(low+high)/2;
            if(A[mid]==key) return mid;
            if(A[mid]<key) low=mid+1;
            else high=mid-1;
        }
        low=index;
        high=h;
         while(low<=high){
            int mid=(low+high)/2;
            if(A[mid]==key) return mid;
            if(A[mid]<key) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}