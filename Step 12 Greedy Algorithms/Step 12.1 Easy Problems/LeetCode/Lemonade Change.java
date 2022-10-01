class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5,0);
        map.put(10,0);
        map.put(20,0);
        
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                int n=map.get(5)+1;
                map.put(5, n);
            }else if(bills[i]==10){
                int n=map.get(10)+1;
                map.put(10,n);
                n=map.get(5)-1;
                if(n<0) return false;
                map.put(5, n);
            }else if(bills[i]==20){
                int n=map.get(10)-1;
                if(n<0) {
                    n=map.get(5);
                    if(n<3) return false;
                    map.put(5,n-2);
                    n=0;
                }
                map.put(10,n);
                n=map.get(5)-1;
                if(n<0) return false;
                map.put(5, n);
            }
        }
        
        return true;
    }
}