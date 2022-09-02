/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node cur = head;
        String str1="",str2="";
        while(cur!=null){
            str1+=String.valueOf(cur.data);
            str2=String.valueOf(cur.data)+str2;
            cur=cur.next;
        }
        if(str1.equals(str2)) return true;
        return false;
    }    
}