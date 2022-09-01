/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x){
        // code here
        Node cur = new Node(x);
        cur.next = head;
        return cur;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x){
        // code here
        Node cur = head;
        if(head == null) return new Node(x);
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(x);
        return head;
    }
}