class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(output.empty()){
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }
        }
        int x=output.peek();
        output.pop();
        return x;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    input.add(x);
    }
}
