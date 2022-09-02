class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        if(head==null || head.next==null){
            return false;
        }
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}