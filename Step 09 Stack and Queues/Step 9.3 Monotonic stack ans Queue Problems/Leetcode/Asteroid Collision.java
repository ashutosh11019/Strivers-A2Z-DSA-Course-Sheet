class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int num: asteroids){
            collision: {
                while(!st.isEmpty() && num<0 && 0<st.peek()){
                    if(st.peek()<-num){
                        st.pop();
                        continue;
                    }else if(st.peek() == -num){
                        st.pop();
                    }
                    break collision;
                }
                st.push(num);
            }
        }
        
        int[] ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}