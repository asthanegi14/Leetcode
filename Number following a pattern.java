class Solution{
    
    static void reverse(StringBuffer s, int i, int j){
        while(i<j){
            char c = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, c);
            i++;
            j--;
        }
    }
    static String printMinNumberForPattern(String s){
        // code here
        StringBuffer str = new StringBuffer();
        int n = s.length();
        char c = '1';
        
        while(str.length()<=s.length()){
            str.append(c++);
        }
        
        for(int j=0;j<n;j++){
            if(s.charAt(j) == 'D'){
                int k = j;
                while(j<n && s.charAt(j)=='D'){
                    j++;
                }
                reverse(str, k, j);
            }
        }
        
        return str.toString();
    }
}
