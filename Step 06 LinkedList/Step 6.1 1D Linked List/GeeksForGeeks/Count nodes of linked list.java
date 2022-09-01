class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        if(head==null){
            return 0;
        }
        Node temp=head;
        int c=1;
        while(temp.next!=null){
            temp=temp.next;
            c=c+1;
        }
        return c;
    }
}