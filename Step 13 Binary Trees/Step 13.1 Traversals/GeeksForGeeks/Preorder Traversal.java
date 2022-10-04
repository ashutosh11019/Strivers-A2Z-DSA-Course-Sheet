class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();
        if(root == null) return arr;
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            arr.add(root.data);
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
        }
        return arr;
    }

}