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
    public ListNode swapNodes(ListNode head, int k) {
        int i=0, n=0;
        ListNode curr=head;

        while(curr!=null){
            n++;
            curr = curr.next;
        }
        ListNode temp = head;
        ListNode t2 = head;
        i = n-k+1;
        while(k-->1){
            temp = temp.next;
        }

        while(i-->1){
            t2 = t2.next;
        }
        int v = temp.val;
        temp.val = t2.val;
        t2.val = v;

        return head;
    }
}
