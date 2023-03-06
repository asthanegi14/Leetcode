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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        ListNode nxt = curr.next;


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
}
