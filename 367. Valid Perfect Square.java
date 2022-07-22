class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 0;
        int n = num;
        while(i<=n)
        {
        long mid = i+(n-i)/2;
        long ans = mid*mid;
           if(ans == num)
           {
               return true;
           }
        
        else if(ans > num){
            n = (int)mid-1;
        }
        else{
           i = (int)mid+1;
        }
        
    }
    return false;
}
}
