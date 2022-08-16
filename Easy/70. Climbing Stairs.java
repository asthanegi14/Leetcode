class Solution {
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if(n==3)
        {
            return 3;
        }
        if(n>3)
        {
            a[0]=1;
            a[1]=1;
            for(int i=2;i<=n;i++)
            {
               a[i] = a[0]+a[1];
                a[0]=a[1];
                a[1]=a[i];
            }
        }
        
        return a[n];
    }
}
