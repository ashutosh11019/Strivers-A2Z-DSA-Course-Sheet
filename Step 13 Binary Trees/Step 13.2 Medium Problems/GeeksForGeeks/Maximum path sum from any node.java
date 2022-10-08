class Solution{
    static int max;
    //Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node){
        //your code goes here
        max=Integer.MIN_VALUE;
        helper(node);
        return max;
    }
    
    static int helper(Node node){
        if(node==null) return 0;
        int l=Math.max(helper(node.left),0);
        int r=Math.max(helper(node.right),0);
        int sum=node.data+l+r;
        max=Math.max(max,sum);
        return node.data+Math.max(l,r);
    }
}