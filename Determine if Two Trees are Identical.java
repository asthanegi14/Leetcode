
class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1==null || root2==null){
	        return root1==null && root2==null;
	    }
        if(root1.data!=root2.data){
	        return false;
	    }
	    
	    boolean l = isIdentical(root1.left, root2.left);
	    boolean r = isIdentical(root1.right, root2.right);
	    
	    return l&&r;
	}
	
}
