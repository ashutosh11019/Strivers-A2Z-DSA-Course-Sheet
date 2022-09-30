class Solution {
    public String minWindow(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int n=s.length(), m=t.length();
        if(m > n) return sb.toString();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int c = map.size(), i = 0, j = 0;
        while(j < n && i < n){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0) c--;
            }
            j++;
            while(c == 0 && i < n){
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){ 
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1) > 0){  
                        if(sb.length() == 0 || sb.length() > (j - i)){
                            sb.setLength(0);
                            sb.append(s.substring(i,j));
                        }
                        c++;
                    } 
                }
                i++;
            }
        }
        return sb.toString();
    }
}