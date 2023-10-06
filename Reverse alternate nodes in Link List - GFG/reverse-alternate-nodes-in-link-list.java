//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node nxt = null;
        
        while(curr!=null){
            nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }
        return pre;
    }
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd==null || odd.next==null){
            return;
        }
        
        Node ans = odd;
        Node temp = ans;
        Node sec = temp.next;
        Node temp2 = sec;
        
        while(temp2!=null && temp2.next!=null){
            temp.next = temp2.next;
            temp2.next = temp2.next.next;
            temp = temp.next;
            temp2 = temp.next;
        }
        
        Node rev = reverse(sec);
        // while(rev!=null){
        //     System.out.println("rev="+rev.data);
        //     rev = rev.next;
        // }
        temp.next = rev;
        odd = ans;
    }
}
