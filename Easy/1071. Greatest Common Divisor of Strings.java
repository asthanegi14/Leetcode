class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!((str1+str2).equals(str2+str1))){
            return "";
        }
        int gcd= findGcd(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }

    public int findGcd(int a, int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    } 
}
