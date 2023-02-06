class Solution {
    public ListNode findMid(ListNode head){
        if(head==null){
            return head;
        }
        ListNode s = head;
        ListNode f = head;

        while(f.next!=null && f.next.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        ListNode nxt = head.next;

        while(curr!=null){
            curr.next = pre;
            pre = curr;
            curr = nxt;

            if(nxt!=null){
                nxt = nxt.next;
            }
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode mid = findMid(head);
        ListNode curr = head;
        ListNode last = reverse(mid.next);

        while(last!=null){
            if(curr.val != last.val){
                return false;
            }
            curr = curr.next;
            last = last.next;
        }

        return true;
    }
}
