
class Solution
{
    int ans=0;
    public void find(Node root, int k, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        a.add(root.data);
        int size=a.size();
        int sum=0;
        
        for(int i=size-1;i>=0;i--){
            sum+=a.get(i);
            if(sum==k){
                ans++;
            }
        }
        
        find(root.left, k, a);
        find(root.right, k, a);
        a.remove(a.size()-1);
    }
    public int sumK(Node root,int k)
    {
        // code here 
        ArrayList<Integer> a = new ArrayList<>();
        find(root, k, a);
        return ans;
    }
}
