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
    public ListNode sortList(ListNode head) {

        //SC: O(n)
        //TC: O(n)


        // if(head==null){
        //     return head;
        // }
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }

        // Collections.sort(arr);
        // int val = arr.get(0);
        
        // ListNode n = new ListNode(val);
        // ListNode x = n;
        // for(int i=1;i<arr.size();i++){
        //     ListNode num = new ListNode(arr.get(i));
        //     x.next = num;
        //     x = x.next;
        // }
        // return n;

        //SC: O(1)
        //TC: O(n log n)


        if(head==null || head.next==null){
            return head;
        }

        //finding middle for merge sort
        ListNode s = head;
        ListNode f = head;
        ListNode temp=null;
        
        while(f!=null && f.next!=null){
            temp = s;
            s = s.next;
            f = f.next.next;
        }
        temp.next=null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(s);

        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode l3 = new ListNode(-1);
        ListNode temp = l3;

        while(l1!=null && l2 !=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                l1=l1.next;
            }
            else{
                temp.next = l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        while(l1!=null){
            temp.next = l1;
            l1=l1.next;
            temp=temp.next;
        }
        while(l2!=null){
            temp.next = l2;
            l2=l2.next;
            temp=temp.next;
        }
        return l3.next;
    }
}
