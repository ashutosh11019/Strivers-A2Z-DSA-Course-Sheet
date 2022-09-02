// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first=reverse(first);
        second=reverse(second);
        Node head=null;
        Node curr=null;
        int carry=0;
        while(first!=null && second!=null) {
            int num=first.data+second.data;
            num=num+carry;
            Node temp=new Node(num%10);
            if(head==null) {
                head=temp;
                curr=head;
            } else {
                curr.next=temp;
                curr=curr.next;
            }
            carry=num/10;
            first=first.next;
            second=second.next;
        }
        
        while(second!=null) {
            int num=second.data;
            num=num+carry;
            Node temp=new Node(num%10);
            curr.next=temp;
            curr=curr.next;
            carry=num/10;
            second=second.next;
        }
        
        while(first!=null) {
            int num=first.data;
            num=num+carry;
            Node temp=new Node(num%10);
            curr.next=temp;
            curr=curr.next;
            carry=num/10;
            first=first.next;
        }
        
        if(carry!=0)
            curr.next=new Node(carry);
        return reverse(head);
    }
    
    static Node reverse(Node head) {
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}