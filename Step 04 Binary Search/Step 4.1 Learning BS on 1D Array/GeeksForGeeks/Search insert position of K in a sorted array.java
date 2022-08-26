class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int low = 0;
        int high = N-1;
        int index = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(Arr[mid] == k) return mid;
            else if(Arr[mid]<k){
                low = mid+1;
                index = mid+1;
            }else if(Arr[mid]>k){
                high = mid-1;
                //index = mid-1;
            }
        }
        return index;
    }
}