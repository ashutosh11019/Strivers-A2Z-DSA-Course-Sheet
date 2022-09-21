class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> l = new ArrayList<>();
        Parenthesis(l,n,"",0,0);
        return l;
    }
    
    public void Parenthesis(List<String> l, int max, String s, int open, int close){
        if(s.length() == max*2) l.add(s);
        if(max>open) Parenthesis(l,max,s+"(",open+1,close);
        if(close<open) Parenthesis(l,max,s+")",open,close+1);
    }
}