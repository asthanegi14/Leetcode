class Solution {
    public double find(double x, int n){
        if(n==0){
            return 1;
        }
        double r = find(x, n/2);
        r *= r;
        
        if(n%2==0){
            return r;
        }
        else{
            return r*x;
        }
    }
    public double myPow(double x, int n) {
        double ret = find(x, Math.abs(n));
        if(n<0){
            return (double)1/ret;
        }
        return ret;
    }
}