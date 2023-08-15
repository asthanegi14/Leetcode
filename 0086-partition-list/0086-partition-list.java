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
    public ListNode partition(ListNode head, int x) {
        // Queue<Integer> q1 = new LinkedList<>();
        // Queue<Integer> q2 = new LinkedList<>();

        // while(head!=null){
        //     if(head.val<x){
        //         q1.add(head.val);
        //     }
        //     else{
        //         q2.add(head.val);
        //     }
        //     head = head.next;
        // }
        // ListNode ans = new ListNode(-1);
        // ListNode temp = ans;
        // while(!q1.isEmpty()){
        //     temp.next = new ListNode(q1.poll());
        //     temp = temp.next;
        // }

        // while(!q2.isEmpty()){
        //     temp.next = new ListNode(q2.poll());
        //     temp = temp.next;
        // }
        // return ans.next;
        
        ListNode sml = head;
        ListNode a1 = new ListNode(-1);        
        ListNode a2 = new ListNode(-1);
        ListNode temp = a1;        
        ListNode temp2 = a2;
        
        while(sml!=null){                
            if(sml.val<x){
                temp.next = sml;
                temp = temp.next;      
            }
            else{
                temp2.next = sml;
                temp2 = temp2.next;
            }
            sml = sml.next;
        }      
        temp2.next = null;
        temp.next = a2.next;     
        return a1.next;
    }
}