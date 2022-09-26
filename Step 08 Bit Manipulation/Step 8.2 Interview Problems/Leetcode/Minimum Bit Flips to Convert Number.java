class Solution {
    public int minBitFlips(int start, int goal) {
        int c=0;
        while(start>0 || goal>0){
            int a = start&1, b = goal&1;
            if(a != b) c++;
            start=start>>1;
            goal=goal>>1;
        }
        return c;
    }
}