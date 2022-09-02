/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int c=0;
    	for(Node temp=head;temp!=null;temp=temp.next){
    	    c=c+1;
    	}
    	if(n>c){
    	    return -1;
    	}
    	c=c-n;
    	if(c<0) return -1;
    	Node t = head;
    	while(c!=0){
    	    t=t.next;
    	    c=c-1;
    	}
    	return t.data;
    }
}
