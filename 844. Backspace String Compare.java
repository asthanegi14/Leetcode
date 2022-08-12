class Solution {
    public String change(String str){
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='#')
            {
                sb.append(str.charAt(i));
            }
            else{
                if(sb.length()>0){
                    sb.setLength(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        String a = change(s);
        String b = change(t);
        if(a.equals(b)){return true;}
        return false;
    }
}
