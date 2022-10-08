class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        return 1+Math.max(l,r);
    }
}