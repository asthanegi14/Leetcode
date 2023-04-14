class Solution {
    public String removeDigit(String number, char digit) {
        String ans = "";
        int br = 0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                br = i;
                if(i<number.length()-1 && digit<number.charAt(i+1)){
                    break;
                }
            }
        }
        ans+=number.substring(0,br)+ number.substring(br+1);
        return ans;
    }
}
