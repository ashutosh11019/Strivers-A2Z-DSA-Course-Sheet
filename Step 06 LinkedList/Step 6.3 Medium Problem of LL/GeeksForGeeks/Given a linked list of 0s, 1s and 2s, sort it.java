/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int c0=0, c1=0, c2=0;
        Node cur=head;
        while(cur != null){
            if(cur.data==0) c0++;
            if(cur.data==1) c1++;
            if(cur.data==2) c2++;
            cur=cur.next;
        }
        Node prev=head;
        while(c0-->0){
            prev.data=0;
            prev=prev.next;
        }
        while(c1-->0){
            prev.data=1;
            prev=prev.next;
        }
        while(c2-->0){
            prev.data=2;
            prev=prev.next;
        }
        return head;
    }
}
