class Solution {
    public int[] movesToStamp(String stamp, String target) {
        ArrayList<Integer> rev = new ArrayList<>();
            
        int n = target.length();
        
        char[] t = target.toCharArray();
        char[] s = new char[n];
        
        Arrays.fill(s,'?');
        
        while(!Arrays.equals(t,s)){
            int stIndx = findSt(t, stamp);
            if(stIndx<0){
                return new int[0];
            }
            else{
                change(t, stIndx, stamp);
            }
            rev.add(stIndx);
        }
        int[] ans = new int[rev.size()];
        
        for(int i=0;i<rev.size();i++){
            ans[i] = rev.get(rev.size()-1-i);
        }
        return ans;
    }
    public int findSt(char[] ch, String s){
        for(int i=0;i<=ch.length-s.length();i++){
            int j=0;
            int str=i;
            boolean non = false;
            while(j<s.length() && str<ch.length &&(ch[str]=='?' || (ch[str]==s.charAt(j))))             {
                if(ch[str] != '?'){
                    non = true;
                }
                 str++;j++;
            }
            if(j==s.length() && non){
                return i;
            }
        }    
        return -1;
    }
    
    public void change(char[] c, int i, String s){
        for(int j=0;j<s.length();j++){
            c[j+i]='?';
        }
    }
}
