class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;// because koko will definitely eat one banana.
        int end=Integer.MAX_VALUE;
        while(start<=end){
            int sph=start+(end-start)/2;
            if(hoursTaken(piles,h,sph))
                  start=sph+1;
            else
                  end=sph-1;    
        }
        return start;
    }
    
    static boolean hoursTaken(int[] piles,int h,int sph){
        int hours=0;
        for(int pile:piles){
            int d=pile/sph ;
            hours+=d;
            int r=pile%sph; 
            if(r!=0) hours++;
        }
        return hours>h;
    }
}