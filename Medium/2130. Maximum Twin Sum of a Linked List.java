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
    public ListNode rev(ListNode head){

        ListNode rev = head;
        ListNode pre = null;
        ListNode curr = head.next;
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }

        while(rev!=null){
            rev.next = pre;
            pre = rev;
            rev = curr;

            if(curr!=null){
                curr = curr.next;
            }
        }
        return pre;
    }
    public int pairSum(ListNode head) {
        ListNode s=head, e=head.next;
        int n=1;
        while(e!=null && e.next!=null){
            s=s.next;
            e=e.next.next;
            n++;
        }
        ListNode pre = rev(s.next);
        int sum=0, ans=0;

        while(n-->0 && pre!=null){
            sum = pre.val+head.val;
            ans = Math.max(sum, ans);
            pre = pre.next;
            head = head.next;
        }
        return ans;
    }
}
