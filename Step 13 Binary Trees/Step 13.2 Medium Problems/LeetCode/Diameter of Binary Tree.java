class Solution {
    static int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        height(root);
        return ans-1;
    }
    
    public static int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        if(ans<(l+r+1)) ans=l+r+1;
        return 1+Math.max(l,r);
    }
}