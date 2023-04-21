class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int i=0;
        while(i<str.length){
            String curr = str[i];
            int j=curr.length()-1;
            String ns = "";
            while(j>=0){
                ns+=curr.charAt(j--);
            }
            str[i] = ns;
            i++;
        }
        String ans = "";
        for(int m=0;m<str.length;m++){
            ans+=str[m];
            if(m<str.length-1){
                ans+=" ";
            }
        }
        return ans;

    }
}
