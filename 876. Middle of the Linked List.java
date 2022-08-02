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
    public ListNode middleNode(ListNode head) {
        if(head==null){return head;}
        ListNode h = head;
        int l = 0;
        while(h!=null)
        {
            h = h.next;
            l++;
        }
        int mid = l/2;
        int x = 0;
        h = head;
        while(x<mid)
        {
            h = h.next;
            x++;
        }
        return h;
    }
}
