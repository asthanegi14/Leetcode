class Solution {
    public boolean isPalimdrome(String s, int i, int j){
        System.out.println("i="+i+" j="+j);
        while(i<=j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1==c2){
                i++; j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if(c1==c2){
                i++; j--;
            }
            else{
                return isPalimdrome(s, i+1,j) || isPalimdrome(s, i, j-1);
            }
        }

        return true;
    }
}
