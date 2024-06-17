class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0, j=(long)Math.sqrt(c);
        
        while(i<=j){
            long num = i*i+j*j;
            if(num>c){
                j--;
            }
            else if(num==c){
                return true;
            }
            else{
                i++;
            }
        }
        
        return false;
    }
}