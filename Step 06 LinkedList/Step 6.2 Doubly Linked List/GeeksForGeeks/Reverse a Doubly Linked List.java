/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node cur=head, prev=null, next=null;
    while(cur!=null){
        next=cur.next;
        cur.next=prev;
        cur.prev=next;
        prev=cur;
        cur=next;
    }
    return prev;
}