class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i], map.getOrDefault(hand[i], 0)+1);
        }
        while(!map.isEmpty()){
            int n=map.firstKey();
            for(int i=0;i<groupSize;i++){
                if(!map.containsKey(n)) return false;
                map.put(n, map.get(n)-1);
                if(map.get(n)==0) map.remove(n);
                n++;
            }
        }
        return true;
    }
}