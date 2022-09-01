/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node temp = new Node(data);
		Node cur = head_ref;
		for(int i=0;i<pos;i++){
		    cur = cur.next;
		}
		temp.next = cur.next;
		temp.prev = cur;
		if(cur.next != null) cur.next.prev = temp;
		cur.next = temp;
	}
}