class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Node temp = new Node(-1);
        Node cur = temp;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<K;i++){
            while(arr[i] != null){
                list.add(arr[i].data);
                arr[i] = arr[i].next;
            }
        }
        
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            Node f = new Node(list.get(i));
            temp.next = f;
            temp = temp.next;
        }
        return cur.next;
    }
}