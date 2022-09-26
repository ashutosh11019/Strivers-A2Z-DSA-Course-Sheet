class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<String>();
        if(num == null || num.length() == 0) return ans;
        help(ans, "", num, target, 0, 0, 0);
        return ans;
    }
    
     public void help(List<String> ans, String path, String num, int target, int pos, long val, long cal){
        if(pos == num.length()){
            if(target == val) ans.add(path);
            return;
        }
        for(int i = pos; i < num.length(); i++){
            if(i != pos && num.charAt(pos) == '0') break;
            long cur = Long.parseLong(num.substring(pos, i + 1));
            if(pos == 0){
                help(ans, path + cur, num, target, i + 1, cur, cur);
            }
            else{
                help(ans, path + "+" + cur, num, target, i + 1, val + cur , cur);
                help(ans, path + "-" + cur, num, target, i + 1, val -cur, -cur);
                help(ans, path + "*" + cur, num, target, i + 1, val - cal + cal * cur, cal * cur );
            }
        }
    }
}