class Solution
{
    static ArrayList<String> list;
    static String[] words = {"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        list = new ArrayList<>();
        help(a, 0, "");
        return list;
    }
    
    static void help(int[] a, int c, String str){
        if(c==a.length){
            list.add(str);
            return;
        }
        String key = words[a[c]];
        for(int i=0;i<key.length();i++){
            help(a, c+1, str+key.charAt(i));
        }
    }
}