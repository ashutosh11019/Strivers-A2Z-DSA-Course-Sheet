class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        int l=0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            if(l%2==0){
                Collections.reverse(subList);
                while(true){
                    list.add(subList.remove(0));
                    if(subList.isEmpty()) break;
                }
                
            }else{
                while(true){
                    list.add(subList.remove(0));
                    if(subList.isEmpty()) break;
                }
            }
            l++;
        }
        return list;
    }
}