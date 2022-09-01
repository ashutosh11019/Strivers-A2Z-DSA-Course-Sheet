/**
 * LinkedList
 */

class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node cur = root;
        cur.next = new Node(2);
        cur.next.next = new Node(3);
        cur.next.next.next = new Node(4);
        cur.next.next.next.next = new Node(5);
        print(root);
    }

    static void print(Node root){
        Node cur = root;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}