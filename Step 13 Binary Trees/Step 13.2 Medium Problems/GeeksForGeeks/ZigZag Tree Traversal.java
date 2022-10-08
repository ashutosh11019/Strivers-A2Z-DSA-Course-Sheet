class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        int count = 1;
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                list.add(queue.remove().data);
            }
            if(count%2==0) Collections.reverse(list);
            count++;
            res.addAll(list);   
        }
        return res;
	}
}