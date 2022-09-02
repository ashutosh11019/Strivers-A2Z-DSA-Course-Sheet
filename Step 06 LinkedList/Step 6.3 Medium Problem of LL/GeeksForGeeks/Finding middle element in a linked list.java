/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
        int n=count(head);
        Node temp=head;
        for(int i=1;i<(n/2)+1;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    int count(Node head){
        if(head==null){
            return 0;
        }
        int c=1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            c=c+1;
        }
        return c;
    }
}