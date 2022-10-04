class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> p = new ArrayList<>();
        if(root==null) return p;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            p.add(root.val);
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
        }
        return p;
    }
}