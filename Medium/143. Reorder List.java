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
        ListNode nw = head;
        int len = 0;

        while(nw!=null){
            st.push(nw);
            nw = nw.next;
            len++;
            System.out.println("peek = "+st.peek().val);
        }
        nw = head;
        for(int i=0;i<len/2;i++){
            ListNode n = nw.next;
            nw.next = st.peek();
            st.pop().next = n;
            nw = nw.next.next;
        }
        nw.next = null;
    }
}
