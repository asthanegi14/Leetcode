class Solution {
    public int find(String s, int i, int[] a){
        if(i==s.length()){
            return 1;
        }
        if(a[i]!=-1){
            return a[i];
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        int count = find(s, i+1, a);
        
        if(i+1<s.length() && Integer.parseInt(s.substring(i, i+2))<=26){
            count += find(s, i+2, a);
        }
        a[i] = count;
        return count;
    } 
    public int numDecodings(String s) {
        int[] a = new int[s.length()];
        Arrays.fill(a, -1);
        
        return find(s, 0, a);
    }
}