//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        // int ans=0;
        // int pow=0;
        // boolean isANeg=false, isBNeg=false;
        
        
        // if(s1.charAt(0)=='-'){
        //     isANeg=true;
        //     s1 = s1.substring(1);
        // }
        // if(s2.charAt(0)=='-'){
        //     isBNeg=true;
        //     s2 = s2.substring(1);
        // }
        // int n=s1.length(), m=s2.length();
        // int i=n-1, j=m-1;
        
        // while(j>=0){
        //     // System.out.println("inside j loop");
        //     int a = (int)(s2.charAt(j)-'0');
        //     i=n-1;
        //     int c=0;
        //     StringBuilder concat = new StringBuilder ();
        //     int pro = 0;
            
        //     while(i>=0){
        //         // System.out.println("inside i loop");
        //         int b = (int)(s1.charAt(i)-'0');
        //         pro = (a*b)+c;
        //         c = pro/10;
        //         concat.insert(0, pro%10);
        //         // System.out.println("pro = "+pro+" b="+b+ " a="+a+ " concat"+concat);
        //         i--;
        //     }
        //     if(c>0){
        //         concat.insert(0, c);
        //     }
        //     // concat.append(Integer.toString((int)Math.pow(10, pow)));
        //     // ans += Integer.parseInt(concat.toString());
        //     for(int k=0;k<pow;k++){
        //         concat.append('0');
        //     }
            
        //     ans += Integer.parseInt(concat.toString());
        //     // System.out.println("concat = "+concat+" ans="+ans);
        //     pow++;
        //     j--;
        // }
        // // StringBuffer ret = new StringBuffer();
        // // while(ans!=0){
        // //     ret.insert(0, ans%10);
        // //     ans/=10;
        // // }
        // // System.out.println("ret = "+ret);
        // if (isANeg ^ isBNeg) {
        //     return "-" + ans;
        // } else {
        //     return Integer.toString(ans);
        // }
        // // return ret.toString();
        
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        
        BigInteger ans = a.multiply(b);
        return ans.toString();
    }
}