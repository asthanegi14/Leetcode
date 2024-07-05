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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minIdx = -1, maxIdx=-1, ans=Integer.MAX_VALUE;
        
        if(head==null || head.next==null || head.next.next==null){
            return new int[]{-1, -1};
        }
        
        ListNode pre = head;
        ListNode temp = head.next;
        ListNode nxt = head.next.next;
        
        int curr=1;
        while(temp!=null && temp.next!=null){
            if((temp.val>pre.val && temp.val>nxt.val) || (temp.val<pre.val && temp.val<nxt.val)){
                if(minIdx == -1){
                    minIdx = curr;
                }
                else{
                    ans = Math.min(ans, curr-maxIdx);
                }
                
                maxIdx = curr;
            }
            pre = temp;
            temp = temp.next;
            nxt = temp.next;
            curr++;
        }
        
        if(minIdx == -1 || minIdx == maxIdx){
            return new int[]{-1, -1};
        }
        
        return new int[]{ans, maxIdx-minIdx};
    }
}