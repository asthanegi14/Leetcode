//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    class Pair{
        int d, w;
        Pair(int d, int w){
            this.d = d;
            this.w = w;
        }
    }
    
    public int[] findPath(ArrayList<ArrayList<Pair>> adj, int n){
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.d - y.d);
        
		int[] ans = new int[n];
		Arrays.fill(ans, Integer.MAX_VALUE);
        
        ans[0] = 0;
        pq.add(new Pair(0, 0));
        
        while(!pq.isEmpty()){
            Pair pop = pq.poll();
            int d = pop.d;
            int w = pop.w;
            
            for(Pair p: adj.get(w)){
                int x = p.d;
                int y = p.w;
                
                if(ans[w]+y<ans[x]){
                    ans[x] = ans[w] + y;
                    pq.add(new Pair(ans[x], x));
                }
            }
        }
        
        for(int i=0;i<ans.length;i++){
            if(ans[i]==Integer.MAX_VALUE){
                ans[i]=-1;
            }
        }
        return ans;
    }
    
	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
        
		for(int i=0;i<M;i++){
		    int s = edges[i][0];
            int d = edges[i][1];
            int w = edges[i][2];
            
            Pair p = new Pair(d, w);
            adj.get(s).add(p);
		}
// 		System.out.println(adj);
		
		
		return findPath(adj, N);
	}
}