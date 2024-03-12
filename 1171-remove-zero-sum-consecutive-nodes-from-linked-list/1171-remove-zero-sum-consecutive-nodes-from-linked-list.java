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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode temp = head;
        
        int sum=0;
        
        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put(0, ans);
        
        while(temp!=null){
            sum += temp.val;
            
            if(map.containsKey(sum)){
                ListNode pre = map.get(sum);
                ListNode remove = pre.next;
                int add = sum;
                
                while(temp != remove){
                    add += remove.val;
                    map.remove(add);
                    remove = remove.next;
                }
                
                pre.next = temp.next;
            }
            else{
                map.put(sum, temp);
            }
            
            temp = temp.next;
        }
        
        return ans.next;
    }
}