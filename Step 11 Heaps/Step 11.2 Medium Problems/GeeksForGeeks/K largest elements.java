class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=k-1;i++){
            list.add(pq.poll());
        }
        return list;
    }
}