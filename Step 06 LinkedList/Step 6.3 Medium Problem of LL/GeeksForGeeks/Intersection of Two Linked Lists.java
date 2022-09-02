/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        HashSet<Integer> hs = new HashSet<>();
        Node cur = head2;
        while(cur!=null){
            hs.add(cur.data);
            cur=cur.next;
        }
        Node dum = new Node(-1);
        Node dummy = dum;
        Node curr=head1;
        while(curr!=null){
            if(hs.contains(curr.data)){
                dummy.next = curr;
                curr=curr.next;
                dummy=dummy.next;
                dummy.next=null;
            }else{
                curr=curr.next;
            }
        }
        return dum.next;
    }
}