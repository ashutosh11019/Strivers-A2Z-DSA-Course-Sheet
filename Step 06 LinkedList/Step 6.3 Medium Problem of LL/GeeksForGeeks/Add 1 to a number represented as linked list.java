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
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        Node cur = head;
        int carry = 0, n = cur.data + 1;
        if(n > 9){
            carry = n/10;
            cur.data = n%10;
            Node prev = cur;
            cur = cur.next;
            
            while(cur != null){
                int t = cur.data + carry;
                cur.data = t%10;
                carry = t/10;
                prev = cur;
                cur = cur.next;
            }
            if(carry != 0) prev.next = new Node(carry);
        }else cur.data = n;
        return reverse(head);
    }
    
    public static Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
