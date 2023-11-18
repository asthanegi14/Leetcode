public static Node reverseDLL(Node  head)
{
    //Your code here
    
    if(head==null || head.next==null){
        return head;
    }
    
    Node pre=null;
    Node curr=head;
    
    while(curr!=null){
        Node nxt=curr.next;
        curr.next = pre;
        curr.prev = nxt;
        pre = curr;
        curr = nxt;
    }
    
    return pre;
}
