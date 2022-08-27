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
        ArrayList<Integer> a = new ArrayList<>();
        if(head==null){return true;}
        while(head!=null){
            a.add(head.val);
            head = head.next;
        }
        // System.out.print("Array list = "+a);
        for(int i=0,j=a.size()-1;i<=a.size()/2;){
            if(a.get(i)!=a.get(j)){return false;}
            else{
                i++;j--;
            }
        }
        return true;
    }
}
