/*
Structure of node class is:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        ArrayList<Integer> adj = new ArrayList<>();
        while(head != null){
            adj.add(head.data);
            head = head.next;
        }
        Collections.sort(adj);
        Node Result = null, dummy = null;
        for(Integer item: adj){
            if(Result == null){
                Result = new Node(item);
                dummy = Result;
            } else {
                dummy.next = new Node(item);
                dummy = dummy.next;
            }
        }
        return Result;
   }


}

// Author Solution:-
class Solution {
    
   public Node sort(Node head){
        return separate(head);
   }

   public Node separate(Node head){
   		Node head2 = null, tail2 = null, temp = head;
   		
   		while(temp != null && temp.next != null){
   			if(head2 == null){
   				head2 = temp.next;
   				tail2 = head2;
   			} else {
   				tail2.next = temp.next;
   				tail2 = tail2.next;
   			}
   			temp.next = temp.next.next;
   			temp = temp.next;
   		}
   		
   		if(head2 == null)
   		    return head;
   		    
   		tail2.next = null;
   		
   		tail2 = head2;
   		head2 = reverse(head2);
   		
   		temp = head;
   		
   		//head and tail of final list 
   		Node head3 = null, tail3 = null;
   		while(head != null && head2 != null){
   		    if(head.data < head2.data){
   		        if(head3 == null){
   		            head3 = head;
   		            tail3 = head3;
   		        } else {
   		            tail3.next = head;
   		            tail3 = tail3.next;
   		        }
   		        head = head.next;
   		    } else {
   		        if(head3 == null){
   		            head3 = head2;
   		            tail3 = head3;
   		        } else {
   		            tail3.next = head2;
   		            tail3 = tail3.next;
   		        }
   		        head2 = head2.next;
   		    }
   		}
   		
   		while(head != null){
   		    tail3.next = head;
   		    tail3 = tail3.next;
   		    head = head.next;
   		}
   		
   		while(head2 != null){
   		    tail3.next = head2;
   		    tail3 = tail3.next;
   		    head2 = head2.next;
   		}
   		
        tail3.next = null;
   		//show(head3);
  
   		return head3;
   }
   
   public Node reverse(Node head){
       Node prev = null, curr = head, next = head;
       while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
   }
   public void po(Object o){
   		System.out.println(o);
   }

}