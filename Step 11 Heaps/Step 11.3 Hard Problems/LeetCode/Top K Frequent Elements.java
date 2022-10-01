class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            pq.add(entry);
            while(pq.size() > k) {
                pq.poll();
            }
        }
        
        int[] res = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            res[i++] = pq.poll().getKey();
        }
        return res;
    }
}