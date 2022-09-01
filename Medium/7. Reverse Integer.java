class Solution {
    public int reverse(int n) {
        long rev=0,m=0;
        while(n!=0){
            m=n%10;
            rev=rev*10+m;
            n/=10;
        }
        if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE){
            return (int)rev;
        }
        else
        return 0;
    }
}
