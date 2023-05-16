class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode t1 = head;
        ListNode pre = null;
        ListNode t2 = head.next;

        while(t1!=null && t1.next!=null){
            ListNode temp = t1.next;
            t1.next = temp.next;
            temp.next = t1;
            
            if(pre!=null){
                pre.next = temp;
            }
            pre = t1;
            t1 = t1.next;
        }
        return t2;

    }
}
