class Solution {
    public int maxDepth(String s) {
        int len = s.length();
		int level = 0;
		int max = 0;
		for(int i = 0; i < len; ++i){
			final char ch = s.charAt(i);
			if(ch == '(') ++level;
			if(ch == ')') --level;
			if(level > max) max = level;
		}
		return max;
    }
}