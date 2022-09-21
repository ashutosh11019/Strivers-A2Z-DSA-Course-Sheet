class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        String str = "";
        List<String> list = new ArrayList<>();
        solve(0, s, str, list);
        Collections.sort(list);
        return list;
    }
    
    static void solve(int i, String s, String str, List<String> list) {
    	if (i == s.length()) {
    		if(str!="") list.add(str);
    		return;
    	}
    	solve(i + 1, s,  str+s.charAt(i), list);
    	solve(i + 1, s,  str, list);
    }
}