class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if(root == null) return arr;
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            st2.add(root);
            if(root.left != null) st.push(root.left);
            if(root.right != null) st.push(root.right);
        }
        while(!st2.isEmpty()){
            arr.add(st2.pop().data);
        }
        return arr;
    }
}