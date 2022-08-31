class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        String st3 = s1 + s1;
        if (st3.contains(s2)) return true;
        return false;
    }
    
}