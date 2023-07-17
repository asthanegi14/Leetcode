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
    public ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode temp = l;

        while(temp!=null){
            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        return prev;
    }

    public ListNode sumIt(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        while(l1!=null && l2!=null){
            int n1 = l1.val, n2 = l2.val;
            int sum = n1+n2+carry;
            int add=0;
            if(sum>=10){
                carry = sum/10;
                add = sum%10;
            }
            else{
                carry = 0;
                add = sum;
            }
            temp.next = new ListNode(add);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            if(carry==0){
                temp.next = l1;
                temp = temp.next;
            }
            else{
                int sum = l1.val+carry;
                int add=0;
                if(sum>=10){
                    carry = sum/10;
                    add = sum%10;
                }
                else{
                    carry = 0;
                    add = sum;
                }
                temp.next = new ListNode(add);
                temp = temp.next;
            }
            l1 = l1.next;
        }
        while(l2!=null){
            if(carry==0){
                temp.next = l2;
                temp = temp.next;
            }
            else{
                int sum = l2.val+carry;
                int add=0;
                if(sum>=10){
                    carry = sum/10;
                    add = sum%10;
                }
                else{
                    carry = 0;
                    add = sum;
                }
                temp.next = new ListNode(add);
                temp = temp.next;
            }
            l2 = l2.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return ans;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode ans = sumIt(l1, l2);
        return reverse(ans.next);
    }
}
