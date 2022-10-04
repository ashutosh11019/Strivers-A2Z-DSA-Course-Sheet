class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            int l=q.size();
            List<Integer> sub = new LinkedList<>();
            for(int i=0;i<l;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sub.add(q.poll().val);
            }
            list.add(sub);
        }
        return list;
    }
}