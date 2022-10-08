class Solution {
    static int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        maxsum(root);
        return max;
    }
    static int maxsum(TreeNode root){
        if(root==null) return 0;
        int l=Math.max(maxsum(root.left),0);
        int r=Math.max(maxsum(root.right),0);
        int sum=root.val+l+r;
        max=Math.max(max, sum);
        return root.val+Math.max(l,r);
    }
}