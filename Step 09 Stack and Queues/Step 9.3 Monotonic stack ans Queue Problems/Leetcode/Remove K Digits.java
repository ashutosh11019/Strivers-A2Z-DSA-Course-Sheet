class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(k>0 && !st.isEmpty() && st.peek()>ch){
                st.pop();
                k--;
            }
            if(st.isEmpty() && ch=='0') continue;
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}