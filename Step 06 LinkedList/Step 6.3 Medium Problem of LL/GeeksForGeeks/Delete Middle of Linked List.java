/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node f=head;
       Node s=head;
       Node prev=null;
       while(f!=null&&f.next!=null){
           prev=s;
           f=f.next.next;
           s=s.next;
           
       }
       prev.next=s.next;
       return head;
    }
}