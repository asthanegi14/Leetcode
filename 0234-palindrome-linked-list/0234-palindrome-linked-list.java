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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        
        ListNode half = head;
        ListNode s = half;
        ListNode f = half.next;
        
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        ListNode secHalf = s.next;
        s.next = null;
        
        ListNode curr = secHalf;
        ListNode pre = null;        
        ListNode nxt = secHalf.next;
        
        while(curr!=null){
            curr.next = pre;
            pre = curr;
            curr = nxt;
            
            if(nxt!=null){
                nxt = nxt.next;
            }
        }
        
        while(pre!=null && half!=null){
            if(pre.val != half.val){
                return false;
            }
            pre = pre.next;
            half = half.next;
        }
        
        // while(pre!=null){
        //     System.out.print(pre.val+" ");
        //     pre = pre.next;
        // }
        // System.out.println();
        // while(half!=null){
        //     System.out.print(half.val+" ");
        //     half = half.next;
        // }
        
        return true;
    }
}