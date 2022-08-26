class Solution {
    int median(int matrix[][], int r, int c) {
        // code here  
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                pq.add(matrix[i][j]);
            }
        }
        int n=pq.size()/2;
        for(int i=0;i<n;i++){
            pq.remove();
        }
        return pq.remove();
    }
}