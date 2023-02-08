class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length() + num2.length();
        int[] resultArr = new int[n];
        int i = num1.length()-1;
        int j = num2.length()-1;
        int k = 0;
        int pro=0;
        int carry=0;
        int res = 0;

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        while(j>=0){
            while(i>=0){
                k = i+j+1;
                pro = (num1.charAt(i)-'0') * (num2.charAt(j)-'0') + carry + resultArr[k];
                res = pro%10;
                carry = pro/10; 
                resultArr[k]=res;
                i--;
            }
            if(carry!=0){
                k--;
                resultArr[k]=carry;
                carry=0;
            }
            if(i<0){
                i=num1.length()-1;
                j--;
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int p=0;p<n;p++){
            // System.out.print(resultArr[p]+" ");
            if(p==0 && resultArr[p]==0){
                continue;
            }
            sb.append(resultArr[p]);
        }
        if(carry!=0){
            sb.insert(0,carry);
        }
        return sb.toString();
    }
}
