class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ar = new int[n];
        for(int i=0;i<k-1;i++){
            ar[i]=-1;
        }
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        int j=k;
        for(int i=k-1;i<n-1;i++){
            ar[i]=pq.peek();
            pq.add(arr[j]);
            if(pq.size()>k){
                pq.poll();
            }
            j++;
        }
        ar[n-1]=pq.peek();
        return ar;
    }
};