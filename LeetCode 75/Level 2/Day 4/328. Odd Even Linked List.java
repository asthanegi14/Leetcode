/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
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
