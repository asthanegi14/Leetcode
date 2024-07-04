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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode ans = new ListNode(-1);
        ListNode c = ans;
        
        while(temp!=null){
            int sum = temp.val;
            temp = temp.next;
            while(temp!=null && temp.val!=0){
                // System.out.println("temp = "+temp.val+" sum = "+sum);
                sum += temp.val;
                temp = temp.next;
            }
            
            // System.out.println("sum = "+sum);
            if(sum!=0){
                c.next = new ListNode(sum);
            }
            c = c.next;
        }
        
        return ans.next;
    }
}