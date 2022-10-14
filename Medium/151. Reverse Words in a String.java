class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            if(!str[i].isEmpty()){
                sb.insert(0,str[i]);
                if(i<str.length-1){
                    sb.insert(0," ");
                }
            }
        }
        return sb.toString();
    }
}
