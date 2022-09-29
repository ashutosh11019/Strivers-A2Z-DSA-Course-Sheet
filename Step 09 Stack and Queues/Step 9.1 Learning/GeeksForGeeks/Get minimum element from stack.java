

class GfG
{
    static class Pair{
        public int first;
        public int second;
        
        public Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    
    Stack<Pair> st = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    if(st.isEmpty()) return -1;
	    return st.peek().second;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
	    if(st.isEmpty()) return -1;
	    int num=st.peek().first;
	    st.pop();
	    return num;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	    if(st.isEmpty()) st.push(new Pair(x,x));
	    else{
	        if(st.peek().second >= x) st.push(new Pair(x,x));
	        else st.push(new Pair(x,st.peek().second));
	    }
    }	
}