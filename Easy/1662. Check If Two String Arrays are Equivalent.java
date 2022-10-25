class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        // System.out.println(sb1+" "+sb2);
        return sb1.toString().equals(sb2.toString());
    }
}
