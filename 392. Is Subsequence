class Solution {
    public boolean isSubsequence(String s, String t) {
        int y=0;
        if(s.length()==0){return true;}
        if(t.length()==0){return false;}
        boolean ans=false;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(y)==t.charAt(i))
            {
                y++;
                ans = true;
            }
            if(y==s.length())
            {
                return true;
            }
        }
        return false;
    }
}
