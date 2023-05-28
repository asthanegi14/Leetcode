class Solution {
    public String removeTrailingZeros(String num) {
        String sub = "";
        int i=num.length()-1;
        while(num.charAt(i)=='0'){
            i--;
        }
        sub = num.substring(0,i+1);
        return sub;
    }
}
