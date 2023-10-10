//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution {
    public static void get(Node root, HashMap<Integer, Node> map, Node par) {
        if (root == null) {
            return;
        }
        map.put(root.data, par);
        get(root.left, map, root);
        get(root.right, map, root);
    }

    private static Node find(Node root, int target) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp.data == target)
                return temp;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        return null;
    }

    private static void check(Node curr, HashMap<Integer, Node> parent, int level, int k, HashMap<Integer, Boolean> visit, ArrayList<Integer> node) {
        if (curr == null)
            return;
        visit.put(curr.data, true);

        if (level == k)
            node.add(curr.data);
        if (curr.left != null && !visit.getOrDefault(curr.left.data, false))
            check(curr.left, parent, level + 1, k, visit, node);
        if (curr.right != null && !visit.getOrDefault(curr.right.data, false))
            check(curr.right, parent, level + 1, k, visit, node);
        if (parent.get(curr.data) != null && !visit.getOrDefault(parent.get(curr.data).data, false)) {
            check(parent.get(curr.data), parent, level + 1, k, visit, node);
        }
    }

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        get(root, map, null);
        Node curr = find(root, target);
        HashMap<Integer, Boolean> vis = new HashMap<>();
        check(curr, map, 0, k, vis, ans);
        Collections.sort(ans);

        return ans;
    }
};
