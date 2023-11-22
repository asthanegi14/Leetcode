class GfG
{
    public static boolean find(Node l, Node r){
        if(l==null || r==null){
            return l==null && r==null;
        }
        if(l.data!=r.data){
            return false;
        }
        return find(l.left, r.right) && find(l.right, r.left);
    }
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null){
            return true;
        }
        return find(root.left, root.right);
    }
}
