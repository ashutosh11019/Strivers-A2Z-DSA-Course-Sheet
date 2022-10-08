

//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        View(root, list, 0);
        return list;
    }
    
    public static void View(Node curr, ArrayList<Integer> list, int level){
        if(curr == null) return;
        if(list.size() == level) list.add(curr.data);
        View(curr.left, list, level+1);
        View(curr.right, list, level+1);
    }
}