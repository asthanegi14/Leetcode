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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insert(List<Integer> arr, int i, int n){
        if(i>n){
            return null;
        }
        int mid = (n+i)/2;
        
        TreeNode node = new TreeNode(arr.get(mid));
        node.left = insert(arr, i, mid-1);   
        node.right = insert(arr, mid+1, n);
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        int i=0, n = arr.size();
        // int mid = i+(n-i)/2;

        // insert(arr, i, mid-1, node);   
        // insert(arr, mid+1, n-1, node);
        return insert(arr,i,n-1);
    }
}
