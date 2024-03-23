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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode f = head;
        int size=0;
        
        while(f!=null){
            st.push(f);
            f = f.next;
            size++;
        }
        
        f = head;
        for(int i=0;i<size/2;i++){
            ListNode node = f.next;
            f.next = st.peek();
            st.pop().next = node;
            f = f.next.next;
        }
        
        f.next = null;
    }
}