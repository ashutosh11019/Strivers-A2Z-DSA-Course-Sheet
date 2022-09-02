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

class Solution{
    Node divide(int N, Node head){
        // code here
        Node odd = new Node(-1);
        Node even  = new Node(-1);
        Node curr = even;
        even.next = head;
        Node curr2 = odd;
        
        while(curr.next!=null){
            if((curr.next.data&1)==1){
                curr2.next = curr.next;
                curr.next = curr.next.next;
                curr2 = curr2.next;
            }else
            curr = curr.next;
        }
        curr2.next = null;
        
        curr.next = odd.next;
        return even.next;
    }
}