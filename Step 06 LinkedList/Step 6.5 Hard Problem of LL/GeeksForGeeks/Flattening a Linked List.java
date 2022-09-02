/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    void traverse(Node root){
        if(root==null) return;
        pq.add(new Integer(root.data));
        traverse(root.bottom);
        traverse(root.next);
    }
    
    Node flatten(Node root)
    {
	    // Your code here
	    traverse(root);
	    Node node=null;
	    while(!pq.isEmpty()){
	        int temp = pq.poll();
	        Node cur = new Node(temp);
	        if(node == null){
	            root=cur;
	            node=root;
	        }else{
	            node.bottom=cur;
	            node=node.bottom;
	        }
	    }
	    return root;
    }
}