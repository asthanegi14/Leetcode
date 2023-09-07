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
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    class Pair{
        int node, step;
        Pair(int node, int step){
            this.node = node;
            this.step = step;
        }
    }
    int minimumMultiplications(int[] a, int start, int end) {
        // Your code here
        if(start==end){
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        int[] arr = new int[100000];
        Arrays.fill(arr, Integer.MAX_VALUE);
        
        q.add(new Pair(start, 0));
        arr[start] = 0;
        
        while(!q.isEmpty()){
            Pair pop = q.poll();
            int n=pop.node;
            int s=pop.step;
            
            for(int i:a){
                int mul = (n*i)%100000;
                // System.out.println("mul="+mul);
                if(arr[mul]>s){
                    arr[mul] = s;
                    q.add(new Pair(mul, s+1));
                }
                if(mul==end){
                    return s+1;
                }
            }
        }
        return -1;
    }
}
