class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==0) return "";
        if(n==1) return strs[0];
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[n-1].length());
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[n-1].charAt(i) )
            i++;
        String pre = strs[0].substring(0, i);
        return pre;
    }
}