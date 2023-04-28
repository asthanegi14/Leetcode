class Solution {
    public boolean isUgly(int n) {
        boolean ans = false;
        if(n==0){
            return false;
        }
        while(n!=0 && n%2==0){
            n/=2;
        }
        while(n!=0 && n%3==0){
            n/=3;
        }
        while(n!=0 && n%5==0){
            n/=5;
        }
        return n==1;
    }
}
