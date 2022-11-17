//With extra space 

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




//Without extra space

class Solution {
    public ListNode findMiddle(ListNode head){
        if(head==null){
            return head;
        }
        ListNode a = head;
        ListNode b = head;

        while(b.next!=null && b.next.next!=null){
            a = a.next;
            b = b.next.next;

        }
        return a;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode pre = null;
        ListNode a = head;
        ListNode b = head.next;

        while(a!=null){
            a.next = pre;
            pre = a;
            a = b;

            if(b!=null){
                b=b.next;
            }
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode mid = findMiddle(head);
        ListNode last = reverse(mid.next);
        ListNode curr = head;

        while(last!=null){
            if(curr.val != last.val){
                return false;
            }
            curr = curr.next;
            last = last.next;
        }
        return true;
    }
}
