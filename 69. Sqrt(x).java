class Solution {
    public int mySqrt(int x) {
        int i=0,n=x,ans=0;
        while(i<=n)
        {
            long half = i+(n-i)/2;
            if(half*half==x){
                return (int)half;
            }
            else if(half*half>x)
            {
                ans = (int)half;
                n = (int)half - 1;
            }
            else
            {
                i = (int)half + 1;
            }
        }
        return ans-1;
    }
}
