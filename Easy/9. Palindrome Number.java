class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        int rev=0,m=0,num=x;
        while(x!=0){
            m=x%10;
            rev=rev*10+m;
            x/=10;
        }
        if(num==rev){
            return true;
        }
        else
            return false;
    }
}
