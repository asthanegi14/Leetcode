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
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        
        ListNode temp = head;
        ListNode pre = null;
        
        while(temp!=null){
            ListNode nxt = temp.next;
            temp.next = pre;
            pre = temp;
            temp = nxt;
        }
        
        return pre;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode temp = reverse(head);
        int carry = 0;
        ListNode curr = temp;

        while (curr != null) {
            int newValue = curr.val * 2 + carry;
            curr.val = newValue % 10;
            carry = newValue / 10;

            curr = curr.next;
        }

        temp = reverse(temp);
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = temp;
            temp = newNode;
        }
        return temp;
//         String num = "";
        
//         while(temp!=null){
//             int n = temp.val;
//             num += n;
//             temp = temp.next;
//         }
        
//         temp = head;
//         int n = Integer.parseInt(num)*2;
        
//         int i=num.length();
//         num +=n;
        
//         ListNode ans = new ListNode(-1);
//         temp = ans;
        
//         while(i<num.length()){
//             int x = num.charAt(i)-'0';
//             temp.next = new ListNode(x);
//             i++;
//             temp = temp.next;
//         }
        
//         return ans.next;
        
    }
}