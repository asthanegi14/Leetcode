class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String s1 = strs[0];
        String sn = strs[strs.length-1];

        while(i<s1.length()){
            if(s1.charAt(i)==sn.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return i==0 ? "" : s1.substring(0,i);
    }
}
