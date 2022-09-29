class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
            if(ch==')'){
                if(st.size()>0 && st.peek()=='(') st.pop();
                else return false;
            }else if(ch=='}'){
                if(st.size()>0 && st.peek()=='{') st.pop();
                else return false;
            }else if(ch==']'){
                if(st.size()>0 && st.peek()=='[') st.pop();
                else return false;
            }else st.push(ch);
        }
        if(st.size()==0) return true;
        else return false;
    }
}