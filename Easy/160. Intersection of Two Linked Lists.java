public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while(a!=b){
            if(a==null){
                a=headB;
            }
            else if(a!=null){
                a=a.next;
            }
            if(b==null){
                b=headA;
            }
            else{
                b=b.next;
            }
        }
        return a;
    }
}
