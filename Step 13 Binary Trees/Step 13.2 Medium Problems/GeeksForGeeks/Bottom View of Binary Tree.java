class Solution
{
    //Function to return a list containing the bottom view of the given tree.
     static class Pair{
        int hd;
        Node node;
        public Pair(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }
    
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            map.put(cur.hd, cur.node.data);
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