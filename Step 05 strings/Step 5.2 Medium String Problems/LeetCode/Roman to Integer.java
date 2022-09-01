class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res=0,i;
        for(i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res=res+map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            }else{
                res=res+map.get(s.charAt(i));
            }
        }
        if(i!=s.length()){
            res=res+map.get(s.charAt(i));
        }
        return res;
    }
}