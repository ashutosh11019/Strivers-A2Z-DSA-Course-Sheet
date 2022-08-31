class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int n = a.length(), m = b.length();
        if(n!=m) return false;
        int count[] = new int[26];
        for(int i=0;i<n;i++){
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
}