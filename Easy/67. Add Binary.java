class Solution {
    public String addBinary(String a, String b) {
        int sum=0, carry=0;
        StringBuffer sb = new StringBuffer();
        int i=a.length()-1, j=b.length()-1;
        while(i>=0 || j>=0){
                sum = carry;
                if(i>=0){
                    char c1 = a.charAt(i);
                    sum+=c1-'0';
                }
                if(j>=0){
                    char c2 = b.charAt(j);
                    sum+=c2-'0';
                }
                sb.append(sum%2);
                carry = sum/2;
                i--;j--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
