class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();
        Node n = head;
        Node node = new Node(-1);
        Node ans = node;
        
        while(n!=null){
            arr.add(n.data);
            n = n.next;
        }
        
        Collections.sort(arr);
        
        for(int i=0;i<arr.size();i++){
            ans.next = new Node(arr.get(i));
            ans = ans.next;
        }
        return node.next;
    }
}
