class Solution {
    public char findTheDifference(String s, String t) {
        int i=0, j=0;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        while(i<s.length() && j<t.length()){
            if(c1[i] == c2[j]){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return c2[j];
    }
}
