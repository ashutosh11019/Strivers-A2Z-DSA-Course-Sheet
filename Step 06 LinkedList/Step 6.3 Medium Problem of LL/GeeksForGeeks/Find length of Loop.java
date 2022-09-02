/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow = head, fast = head.next;
        while(fast != slow){
            if(fast == null || fast.next == null) return 0;
            fast = fast.next.next;
            slow = slow.next;
        }
        int ans = 1;
        fast = fast.next;
        while(fast!=slow){
            fast = fast.next;
            ans++;
        }
        return ans;
    }
}