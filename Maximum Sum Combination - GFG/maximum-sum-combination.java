//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // class Pair{
    //     int a;
        
    // }
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        List<Integer> ans = new ArrayList<>(K);
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=N-1;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                int sum = (A[i]+B[j])*-1;
                if(pq.size()<K){
                    pq.add(sum);
                }
                else if(sum<pq.peek()){
                    pq.poll();
                    pq.add(sum);
                }
                else {
                    break;
                }
            }
        }
        
        while (!pq.isEmpty()) {
            ans.add(-pq.poll());
        }

        Collections.reverse(ans);

        return ans;
        
    }
}
