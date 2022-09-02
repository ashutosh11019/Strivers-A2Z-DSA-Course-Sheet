/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node cur = head, prv = head;
        while(prv.next != null) prv = prv.next;
        while(cur.data < prv.data){
            int sum = cur.data + prv.data;
            if(sum==target){
                ArrayList<Integer> sub = new ArrayList<>();
                sub.add(cur.data);
                sub.add(prv.data);
                ans.add(sub);
                cur = cur.next;
                prv = prv.prev;
            }else if(sum>target){
                prv = prv.prev;
            }else{
                cur = cur.next;
            }
        }
        return ans;
    }
}