/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        if(head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        while(node != null){
            map.put(node, new Node(node.data));
            node = node.next;
        }
        node = head;
        while(node != null){
            map.get(node).next = map.get(node.next);
            map.get(node).arb = map.get(node.arb);
            node = node.next;
        }
        return map.get(head);
    }
}