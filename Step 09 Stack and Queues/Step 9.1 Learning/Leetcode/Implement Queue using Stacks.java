class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(st2.empty()){
            while(st1.empty()==false){
                st2.push(st1.peek());
                st1.pop();
            }
        }
        int x=st2.peek();
        st2.pop();
        return x;
    }
    
    public int peek() {
        if(st2.empty()){
            while(st1.empty()==false){
                st2.push(st1.peek());
                st1.pop();
            }
        }
        return st2.peek();
    }
    
    public boolean empty() {
        if(size()==0) return true;
        else return false;
    }
    
    public int size(){
        return (st2.size()+st1.size());
    }
}
