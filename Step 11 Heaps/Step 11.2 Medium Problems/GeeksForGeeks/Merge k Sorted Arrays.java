class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                pq.add(arr[i][j]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        return list;
    }
}