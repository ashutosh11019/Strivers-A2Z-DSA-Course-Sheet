class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class Solution{
	public static void main(String[] args){
		Node head = null;
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 2);
        head = push(head, 4);
        head = push(head, 8);
        head = push(head, 10);
        head = push(head, 2);
        head = push(head, 2);
        System.out.println("Original Doubly linked list: ");
        printList(head);
        int x = 2;
        head = deleteAllOccurOfX(head, x);
        System.out.println("\nDoubly linked list after deletion of" + x +":");
        printList(head);
	}

	static Node deleteAllOccurOfX(Node head, int x){
        if (head == null) return null;
        Node current = head;
        Node next;
        while (current != null){
            if (current.data == x){
                next = current.next;
                head = deleteNode(head, current);
                current = next;
            }else current = current.next;
        }
        return head;
    }

    static Node push (Node head, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;        
        new_node.prev = null;
        new_node.next = head;
        if (head != null) head.prev = new_node;
        head = new_node;
        return head;
    }

    static Node deleteNode(Node head, Node del){
        if (head == null || del == null) return null;
        if (head == del) head = del.next;
        if (del.next != null) del.next.prev = del.prev;
        if (del.prev != null)del.prev.next = del.next;
        del = null;
        return head;
    }

    public static void removeDuplicates(Node head){
        if (head== null) return;
        Node current = head;
        while (current.next != null){
            if (current.data == current.next.data) deleteNode(head, current.next);
            else current = current.next;
        }
    }
}