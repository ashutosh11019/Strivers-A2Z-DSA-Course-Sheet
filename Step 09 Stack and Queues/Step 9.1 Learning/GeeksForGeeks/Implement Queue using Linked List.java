

/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode q = new QueueNode(a);
        if(front==null)
            front=rear=q;
        else{
            rear.next=q;
            rear=q;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null)
            return -1;
        else if(front.next==null){
            int val=front.data;
            front=rear=null;
            return val;
        } else {
            QueueNode q = front.next;
            int val=front.data;
            front.next=null;
            front=q;
            return val;
        }
	}
}


