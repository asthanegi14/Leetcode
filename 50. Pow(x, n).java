class Solution {
    public double xpown(double x, int n)
    {
        if(n==0)  //break condition
        {
            return 1; 
        }
        double y = xpown(x,n/2)a; //use of divide and conqure rule 
        double z = y*y; //eg. 2^5 * 2^5 => 2^2 * 2^2 * 2^5
        
        if(n%2==1)
        {
            z = z*x; //if n is odd like in above eg. so z = 2 * 2^5 * 2^5 => 2^2 * 2^2 * 2^5
        }
        return z;
    }
    public double myPow(double x, int n) {
        if(n==0){return 1.0;}
        else if(n<0)
        {
            x = 1.0/x;
            int a = (n/2);
            int b = (n-a);
            a=-a; b=-b;
            return xpown(x,a)*xpown(x,b);
        }
        return xpown(x,n);
    }
}
