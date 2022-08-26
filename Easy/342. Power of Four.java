class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){return true;}
        if(n%4!=0 || n==0){return false;}
        int x = 1;
        while(x<n){
            x*=4;
        }
        // System.out.println("x="+x);
        if(x==n){return true;}
        return false;
        
    }
}
