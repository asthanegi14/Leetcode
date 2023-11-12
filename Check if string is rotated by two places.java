class Solution
{
    public static boolean find(String a, String b){
        int i=0, n=a.length();
        
        while(i<n){
            if(a.charAt(i)!=b.charAt((i+2)%n)){
                return false;
            }
            i++;
        }
        return true;
    }
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()){
            return false;
        }
        return find(str1, str2) || find(str2, str1);
    }
    
}
