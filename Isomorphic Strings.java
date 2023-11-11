class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length() != str2.length()){
            return false;
        }
        char[] c = new char[26];
        char[] c2 = new char[26];
        Arrays.fill(c, '0');
        Arrays.fill(c2, '0');
        
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i); 
            char ch2 = str2.charAt(i); 
            c[ch-'a'] = ch2;
            c2[ch2-'a'] = ch;
        }
        
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i); 
            char ch2 = str2.charAt(i);
            if(c[ch-'a'] != ch2){
                return false;
            }
            if(c2[ch2-'a'] != ch){
                return false;
            }
        }
        return true;
    }
}
