class Node {
        int num;
        Node next;
        Node(int a) {
            num = a;
            next = null;
        }
}

class Solution{
	static Node reverseKNodes(Node head,int k) {
	    if(head == null||head.next == null) return head;
	    
	    int length = lengthOfLinkedList(head);
	    
	    Node dummyHead = new Node(0);
	    dummyHead.next = head;
	    
	    Node pre = dummyHead;
	    Node cur;
	    Node nex;
	    
	    while(length >= k) {
	        cur = pre.next;
	        nex = cur.next;
	        for(int i=1;i<k;i++) {
	            cur.next = nex.next;
	            nex.next = pre.next;
	            pre.next = nex;
	            nex = cur.next;
	        }
	        pre = cur;
	        length -= k;
	    }
	    return dummyHead.next;
	}
}