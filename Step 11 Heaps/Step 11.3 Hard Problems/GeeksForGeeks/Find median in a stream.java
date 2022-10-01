class Solution
{
    //Function to insert heap.
    static PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    static PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
    
    public static void insertHeap(int x)
    {
        // add your code here
        pq1.add(x);
        pq2.add(pq1.peek());
        pq1.poll();
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       if(pq2.size()>pq1.size()){
           pq1.add(pq2.peek());
           pq2.poll();
       }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(pq1.size() == pq2.size()){
            int val1=pq1.peek();
            int val2=pq2.peek();
            return (double)(val1+val2)/2;
        }
        return (double)pq1.peek();
    }
    
}