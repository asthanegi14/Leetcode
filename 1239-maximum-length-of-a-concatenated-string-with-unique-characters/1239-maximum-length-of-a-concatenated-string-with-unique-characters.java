class Solution {
    public boolean isValid(String s){
        char[] c = new char[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            c[ch-'a']++;
            if(c[ch-'a']>1){
                return false;
            }
        }
        
        return true;
    }
    public int find(List<String> arr, int i, String con){
        if(i==arr.size()){
            if(isValid(con)){
                return con.length();
            }
            return 0;
        }
        
        int take = find(arr, i+1, (con+arr.get(i)));        
        int skip = find(arr, i+1, con);

        return Math.max(take, skip);
    }
    public int maxLength(List<String> arr) {
        return find(arr, 0, "");
    }
}