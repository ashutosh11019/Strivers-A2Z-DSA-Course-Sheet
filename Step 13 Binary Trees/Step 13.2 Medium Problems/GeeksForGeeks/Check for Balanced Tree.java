class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    public static int height(Node root){
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        return 1+Math.max(l,r);
    }
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(root == null) return true;
	    int l = height(root.left);
	    int r = height(root.right);
	    if(Math.abs(r-l) > 1) return false;
	    boolean left = isBalanced(root.left);
	    boolean right = isBalanced(root.right);
	    if(left==false || right==false) return false;
	    return true;
    }
}