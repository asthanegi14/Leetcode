class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node ans = new Node(-1);
        Node temp = ans;
        
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                temp.next = new Node(head1.data);
                temp = temp.next;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1.data<head2.data){
                head1 = head1.next;
            }
            else if(head1.data>head2.data){
                head2 = head2.next;
            }
        }
        
        return ans.next;
    }
}
