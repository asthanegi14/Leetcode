class Solution {
    public int getLucky(String s, int k) {
        int i=0, n=s.length();
        long num=0;
        String st="";

        while(i<n){
            st+=s.charAt(i)-'a'+1;
            i++;
        }
        int sum=0;
        i=0; 
        while(k-->0){
            i=0; 
            sum=0;
            while(i<st.length()){
                sum+=st.charAt(i)-'0';
                i++;
            }
            st = String.valueOf(sum);
        }
        return sum;
    }
}
