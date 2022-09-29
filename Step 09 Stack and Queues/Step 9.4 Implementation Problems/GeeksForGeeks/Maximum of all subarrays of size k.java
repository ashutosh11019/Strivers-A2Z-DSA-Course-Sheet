class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ar = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++){
            max=arr[i];
            for(int j=i;j<i+k;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            ar.add(max);
        }
        return ar;
    }
}