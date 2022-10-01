class Solution {
    static class Pair{
        int key,value;
        public Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.value != b.value) return b.value - a.value;
            return b.key - a.key;
            
            
        });
        for(int key : map.keySet())
        {
            
            int freq = map.get(key);
            pq.add(new Pair(key, freq));
            
        }
        
        int []ans = new int[k];
        int i =0;
        while(k > 0)
        {
            Pair rem = pq.remove();
            ans[i] = rem.key;
            k--;
            i++;
        }
        
        return ans;
    }
}