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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode node: lists){
            while(node!=null){
                q.add(node);
                node = node.next;
            }
        }
        ListNode root = new ListNode(-1);
        ListNode ans = root;
        while(!q.isEmpty()){
            root.next = q.poll();
            root = root.next;
            root.next=null;
        }
        return ans.next;
    }
}
