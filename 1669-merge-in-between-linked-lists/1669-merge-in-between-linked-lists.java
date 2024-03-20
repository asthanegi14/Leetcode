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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        
        while(a!=1 && temp!=null){
            temp = temp.next;
            a--;
            b--;
        }
        ListNode sep = temp;
        
        while(b!=0 && sep!=null){
            sep = sep.next;
            b--;
        }
        
        temp.next = list2;
        
        while(list2.next!=null){
            list2 = list2.next;
        }
        
        list2.next = sep.next;
        
        return list1;
    }
}