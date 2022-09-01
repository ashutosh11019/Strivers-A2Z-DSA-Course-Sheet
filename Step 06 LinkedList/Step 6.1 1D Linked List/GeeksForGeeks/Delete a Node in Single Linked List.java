/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	    // Your code here	
	    int c=0;
	    if(x==1) return head.next;
	    Node cur = head;
	    for(int i=1;i<x-1;i++){
	        cur = cur.next;
	    }
	    cur.next=cur.next.next;
	    return head;
    }
}