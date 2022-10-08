class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        int flag=0;
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode cur=q.poll();
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
                list.add(cur.val);
            }
            if(flag==0){
                ans.add(list);
                flag=1;
            }else{
                Collections.reverse(list);
                ans.add(list);
                flag=0;
            }
        }
        return ans;
    }
}