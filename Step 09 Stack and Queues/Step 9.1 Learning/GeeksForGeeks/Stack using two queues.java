class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    int pop=-1;
        if(!q1.isEmpty()){
            while(q1.size()!=1){
                q2.add(q1.poll());
            }
            pop=q1.poll();
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }
        return pop;
    }
	
}