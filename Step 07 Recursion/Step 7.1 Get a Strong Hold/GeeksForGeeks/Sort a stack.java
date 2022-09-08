class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.size()==1){
		    return s;
		}
		int max = Integer.MIN_VALUE;
		Stack<Integer> st = new Stack<>();
		while(!s.empty()){
		    if(s.peek()>max){
		        if(max==Integer.MIN_VALUE){
		            max=s.peek();
		        }else{
		            st.push(max);
		            max=s.peek();
		        }
		        s.pop();
		    }else {
		        
		        st.push(s.pop());
		    }
		}
		Stack<Integer> ans= sort(st);
		ans.push(max);
		return ans;
	}
}