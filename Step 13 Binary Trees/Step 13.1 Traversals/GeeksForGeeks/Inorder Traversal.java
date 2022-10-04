class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> st = new Stack<Node>();
        Node node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()) break;
                node = st.pop();
                arr.add(node.data);
                node=node.right;
            }
        }
        return arr;
    }
}