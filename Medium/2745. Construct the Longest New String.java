class Solution {
    public int longestString(int x, int y, int z) {
        int a = Math.min(x, y);
        if(x==y){
            return (4*x+2*z);
        }
        else{
            return (2*a+(a+1)*2+2*z);
        }
    }
}
