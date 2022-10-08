

//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }
    
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(!map.containsKey(cur.hd)) map.put(cur.hd, cur.node.data);
            if(cur.node.left != null) q.add(new Pair(cur.hd-1, cur.node.left));
            if(cur.node.right != null) q.add(new Pair(cur.hd+1, cur.node.right));
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            arr.add(entry.getValue());
        }
        return arr;
    }
}