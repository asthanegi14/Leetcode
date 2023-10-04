//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int find(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10;
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500;
        }
        if(c=='M'){
            return 1000;
        }
        return -1;
    }
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int ans=0;
        
        if(str.length()==1){
            return find(str.charAt(0));
        }
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int num = find(c);
            
            if(!st.isEmpty() && st.peek()<num){
                int pop = st.pop();
                st.push(num-pop);
            }
            else{
                st.push(num);
            }
        }
        
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}