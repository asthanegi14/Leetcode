class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode o = odd;
        ListNode e = even;
       
            while(e!=null){
                if(e.next!=null){
                    o.next = e.next;
                }
                else{
                    o.next = even;
                    return odd;
                }
                o = o.next;
                e.next = o.next;
                e = e.next;
            }

        o.next = even;
        return odd;
    }
}



class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode o = odd;
        ListNode e = even;

        while(e!=null && e.next!=null){
            o.next = o.next.next;
            o = o.next;

            e.next = e.next.next;
            e = e.next;
        }
        o.next = even;
        return odd;
    }
}
