//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int i=0, j=0, n=s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int st=0, ed=0;
        
        while(j<n){
            char c = s.charAt(j);
            set.add(c);
            map.put(c, map.getOrDefault(c, 0)+1);
            
            while(i<=j && set.size()>k){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)-1);
                if(map.get(ch)==0){
                    set.remove(ch);
                }
                i++;
            }
            
            if(ed-st<j-i){
                ed = j;
                st = i;
            }
            j++;
        }
        if(set.size()<k){
            return -1;
        }
        return (ed-st+1)>=k?(ed-st+1):-1;
    }
}