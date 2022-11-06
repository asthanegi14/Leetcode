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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans ;
        int carry = 0, sum = 0;
        while(l1!=null || l2!=null || carry!=0){
            ListNode c = new ListNode(0);
            sum = ((l2==null)?0:l2.val)+((l1==null)?0:l1.val)+carry;
            c.val = sum%10;
            carry = sum/10;

            ans.next = c;
            ans = c;

            l1=(l1==null)?l1:l1.next;
            l2=(l2==null)?l2:l2.next;
        }
        return head.next;
    }
}
