//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution {
    // Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[]) {
        int[] tail = new int[size];
        int length = 1;
        
        tail[0] = a[0]; 
        
        for (int i = 1; i < size; i++) {
            if (a[i] > tail[length - 1]) {
                tail[length] = a[i];
                length++;
            } else {
                int index = binarySearch(tail, 0, length - 1, a[i]);
                tail[index] = a[i];
            }
        }
        
        return length;
    }
    
    static int binarySearch(int[] tail, int left, int right, int key) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (tail[mid] >= key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
