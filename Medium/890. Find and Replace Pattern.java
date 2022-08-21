class Solution {
    static boolean matchPattern(String s, String p)
    {
        if(s.length()!=p.length()){return false;}
        int[] a = new int[256];
        int[] b = new int[256];
        for(int i=0;i<256;i++)
        {
            a[i]=0;
            b[i]=0;
        }
            for(int i=0;i<p.length();i++)
            {
                int x = (int)p.charAt(i);
                int y = (int)s.charAt(i);
                
                if(a[x]==0 && b[y]==0)
                {
                    a[x]=y;
                    b[y]=x;
                }
                else if(a[x]!=y){
                    return false;
                }
            }
    return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();            
        String s = "";
        for(int i=0;i<words.length;i++)
        {
            s = words[i];
            if(matchPattern(s,pattern)){
                ans.add(s);
            }
        }
        return ans;
    }
}
