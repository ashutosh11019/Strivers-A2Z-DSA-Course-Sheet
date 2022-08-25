class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null) return head;
        Node pre = null;
       Node cur = head;
       Node temp = null;
       while(cur!=null && cur.next!=null)
       {
           temp = cur.next;
           cur.next = temp.next;
           temp.next = cur;
           if(pre==null)head=temp;
           else pre.next=temp;
           pre = cur;
           cur = cur.next;
       }
       return head;
    }
}