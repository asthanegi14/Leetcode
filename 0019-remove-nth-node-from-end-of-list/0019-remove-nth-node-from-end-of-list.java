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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next == null && n>0)){
            return null;
        }
        int size = 0;      
        ListNode t = new ListNode(-1);
        ListNode temp = t;
        temp.next = head;
        
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int s = size - n;
        ListNode x = t;
        // System.out.println("size = "+size);
        
        while(s>1){
            x = x.next;
            s--;
        }
        x.next = x.next.next;
        
        return t.next; 
    }
}