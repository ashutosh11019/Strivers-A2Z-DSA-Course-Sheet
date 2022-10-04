class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
        Deque<Integer> q = new ArrayDeque<>();
        int ans=0, i=0;
        while(i<N){
            if(q.contains(pages[i])){
                q.remove(pages[i]);
                q.offer(pages[i++]);
            }else{
                if(q.size()<C){
                    q.offer(pages[i++]);
                    ans++;
                }else break;
            }
        }
        while(i<N){
            if(q.contains(pages[i])){
                q.remove(pages[i]);
                q.offer(pages[i]);
            }else{
                q.pollFirst();
                q.offer(pages[i]);
                ans++;
            }
            i++;
        }
        return ans;
    }
}