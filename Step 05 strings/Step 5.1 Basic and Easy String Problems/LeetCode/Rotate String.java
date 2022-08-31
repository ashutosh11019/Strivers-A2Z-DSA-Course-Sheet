lass Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length(), m=goal.length();
        if(n != m) return false;
        String str = s+s;
        if (str.contains(goal)) return true;
        return false;
    }
}