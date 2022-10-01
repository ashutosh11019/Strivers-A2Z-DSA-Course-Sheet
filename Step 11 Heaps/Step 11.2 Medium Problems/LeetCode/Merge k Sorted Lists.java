/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> cmp=new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2)
            {
                return l1.val-l2.val;
            }
        };
        PriorityQueue<ListNode> pq=new PriorityQueue<>(cmp);
        for(ListNode list:lists)
        {
            if(list!=null)
            {
                pq.add(list);
            }
        }
        ListNode head=null;
        ListNode tail=head;
        while(!pq.isEmpty())
        {
            ListNode node=pq.poll();
            if(head==null)
            {
                head=node;
                tail=head;
            }
            else
            {
                tail.next=node;
                tail=node;
            }
            if(node.next!=null)
            {
                pq.add(node.next);
            }
        }
        return head;
    }
}