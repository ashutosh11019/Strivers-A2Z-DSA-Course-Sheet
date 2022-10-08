

/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        return root==null || isSymmetricHelp(root.left, root.right);
    }
    
    public static boolean isSymmetricHelp(Node left, Node right){
        if(left == null || right == null) return left==right;
        if(left.data != right.data) return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right,right.left);
    }
}