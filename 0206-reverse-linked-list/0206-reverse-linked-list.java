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
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode pre = null;        
        ListNode temp = head;
        ListNode nxt = head.next;
        
        while(temp!=null){
            temp.next = pre;
            pre = temp;
            temp = nxt;
            
            if(temp!=null){
                nxt = nxt.next;
            }
        }
        
        return pre;
    }
}