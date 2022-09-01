public boolean search(Node head, int x){
    if (head == null) return false;
    if (head.data == x) return true;
    return search(head.next, x);
}

public boolean search(Node head, int x){
    Node current = head;
    while (current != null)
    {
        if (current.data == x)
            return true;
        current = current.next;
    }
    return false;
}