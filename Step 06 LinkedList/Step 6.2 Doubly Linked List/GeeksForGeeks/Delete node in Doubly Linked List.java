/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    // Your code here	
	    if(head==null || head.next==null) return null;
	    if(x==1){
	        head=head.next;
	        head.prev=null;
	        return head;
	    }
	    Node cur=head;
	    for(int i=0;i<x-1 && cur!=null;i++) cur=cur.next;
	    cur.prev.next=cur.next;
	    return head;
    }
}