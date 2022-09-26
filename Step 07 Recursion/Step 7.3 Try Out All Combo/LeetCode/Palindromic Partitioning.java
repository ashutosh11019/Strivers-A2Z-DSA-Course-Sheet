class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        
        helper(result, s, 0, new ArrayList<>());
        return result;
    }
    
    public void helper(List<List<String>> result, String s, int index, List<String> current) {
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            String str = s.substring(index, i + 1);
            
            if (isPalindrome(str)) {
                current.add(str);
                
                helper(result, s, i + 1, current);
                
                current.remove(current.size() - 1);
            }
        }
    }
    
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
}