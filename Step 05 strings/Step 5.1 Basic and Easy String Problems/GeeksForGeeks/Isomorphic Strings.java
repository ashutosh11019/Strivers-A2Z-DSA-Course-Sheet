class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        HashMap<Character, Character> map = new HashMap<>();
        int n=str1.length(), m=str2.length();
        if(n != m) return false;
        for(int i=0;i<n;i++){
            if (map.containsKey(str1.charAt(i))) {
                if (map.get(str1.charAt(i))!= str2.charAt(i)){
                    return false;
                }
            }else {
                if(map.containsValue(str2.charAt(i))){
                    return false;
                }  else{
                    map.put(str1.charAt(i),str2.charAt(i));
                }
            }
        }
        // System.out.println(map);
        return true;
    }
