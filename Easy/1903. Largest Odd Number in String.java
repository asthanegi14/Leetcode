class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        // int numIn = Integer.parseInt(num);
        // if(numIn%2!=0){
        //     return num; 
        // }
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return ans;
    }
}
