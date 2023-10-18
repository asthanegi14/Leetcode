//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean dfs(List<List<Integer>> adj, int i, boolean[] safe, boolean[] visited) {
        if (visited[i]) {
            return safe[i];
        }
        
        visited[i] = true;
        
        for (int j : adj.get(i)) {
            if (!dfs(adj, j, safe, visited)) {
                return safe[i] = false;
            }
        }
        
        return safe[i] = true;
    }

    public List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        List<Integer> ans = new ArrayList<>();
        boolean[] safe = new boolean[V];
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (dfs(adj, i, safe, visited)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
