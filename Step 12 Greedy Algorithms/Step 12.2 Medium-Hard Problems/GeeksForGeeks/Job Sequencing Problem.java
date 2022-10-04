class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        PriorityQueue<Job> pq = new PriorityQueue<>((a,b)->b.profit-a.profit);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           pq.add(arr[i]);
           if(arr[i].deadline>max){
               max = arr[i].deadline;
           }
        }

        int check[] = new int[max+1];
        int count = 0;
        int maxProfit =0;
        while(!pq.isEmpty()){
           Job poll = pq.poll();
           for(int i=poll.deadline;i>=1;i--){
              if(check[i] ==0){
                  check[i] = 1;
                  count++;
                  maxProfit = maxProfit+poll.profit;
                  break;
                  
              }
           }
        }
        return new int[]{count,maxProfit};
    }
}