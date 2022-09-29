class Solution {
    public String removeKdigits(String s, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char num = s.charAt(i);
            while (k > 0 && !st.isEmpty() && st.peek() > num){
                st.pop();
                k--;
            }
            if(st.isEmpty() && num == '0')
                continue;
            st.push(num);
        }
        while(!st.isEmpty() && k > 0){
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