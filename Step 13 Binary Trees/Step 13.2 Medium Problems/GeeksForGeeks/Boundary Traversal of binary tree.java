class Solution
{
	boolean isLeaf(Node node){
	    if(node.left == null && node.right == null){
	        return true;
	    }else{
	        return false;
	    }
	}
	
	void addLeftBoundary(Node node, ArrayList<Integer> ans){
	    Node cur = node.left;
	    while(cur != null){
	        if(isLeaf(cur) == false) ans.add(cur.data);
	        if(cur.left != null) cur=cur.left;
	        else cur=cur.right;
	    }
	}
	
	void addRightBoundary(Node node, ArrayList<Integer> ans){
	    Node cur = node.right;
	    ArrayList<Integer> arr = new ArrayList<>();
	    while(cur != null){
	        if(isLeaf(cur) == false) arr.add(cur.data);
	        if(cur.right != null) cur=cur.right;
	        else cur=cur.left;
	    }
	    for(int i=arr.size()-1;i>=0;--i){
	        ans.add(arr.get(i));
	    }
	}
	
	void addLeaves(Node node, ArrayList<Integer> ans){
	    if(isLeaf(node)){
	        ans.add(node.data);
	        return;
	    }
	    if(node.left != null) addLeaves(node.left, ans);
	    if(node.right != null) addLeaves(node.right, ans);
	}
	
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(node == null) return ans;
	    if(isLeaf(node) == false) ans.add(node.data);
	    addLeftBoundary(node, ans);
	    addLeaves(node, ans);
	    addRightBoundary(node, ans);
	    return ans;
	}
}