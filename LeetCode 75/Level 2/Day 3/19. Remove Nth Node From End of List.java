class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t1 = new ListNode(-1);
        ListNode t2 = t1;
        ListNode t3 = t1;

        t3.next = head;
        for(int i=0;i<=n;i++){
            t2 = t2.next;
        }

        while(t2!=null){
            t3 = t3.next;
            t2 = t2.next; 
        }

        t3.next = t3.next.next;

        return t1.next;
    }
}
