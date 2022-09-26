class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] visited = new boolean[n+1];
        return visit(s, 0, wordDict, visited);
    }
    
    private boolean visit(String s, int p, List<String> wordDict, boolean[] visited) {
        if (p == s.length()) return true;
        visited[p] = true;
        for (String word: wordDict) {
            if (s.startsWith(word, p) && !visited[p + word.length()] ) {
                if (visit(s, p + word.length(), wordDict, visited)) return true;
            }
        }
        return false;
    }
}