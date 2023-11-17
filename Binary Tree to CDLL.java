class Solution
{ 
    static Node pre, ans;
    
    Solution(){
        this.pre = null;
        this.ans = null;
    }
    public static void build(Node root){
        if(root==null){
            return;
        }
        build(root.left);
        if(pre==null){
            ans = root; 
        }
        else{
            root.left = pre;
            pre.right = root;
        }
        
        pre = root;
        
        build(root.right);
    }
    
    public static void conv(Node root){
        Node l=ans;
        while(l.right!=null){
            l=l.right;
        }
        
        l.right=ans;
        ans.left=l;
    }
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        ans = null;
        build(root);
        conv(ans);
        return ans;
    }
    
}
