class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        int[] d = new int[1];
        height(root, d);
        return d[0]+1;
    }
    
    int height(Node node, int[] d){
        if(node==null) return 0;
        int l = height(node.left,d);
        int r = height(node.right,d);
        d[0]=Math.max(d[0],l+r);
        return 1+Math.max(l,r);
    }
}