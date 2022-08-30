class Solution {
    public static boolean check(int[] bloomDay, int mid, int m, int k){
        for(int i=0;i<bloomDay.length;i++){
            int count = k;
            while(i<bloomDay.length && bloomDay[i]<=mid){
                count--;
                if(count==0){
                    m--;
                    break;
                }
                i++;
            }
            if(m==0) return true;
        }
        return false;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int l=Integer.MAX_VALUE, h=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            l=Math.min(l, bloomDay[i]);
            h=Math.max(h, bloomDay[i]);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(bloomDay, mid, m, k)==true) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
}