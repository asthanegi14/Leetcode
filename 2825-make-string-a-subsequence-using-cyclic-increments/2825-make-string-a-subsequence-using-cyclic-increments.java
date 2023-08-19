class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 < len2) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, (char) ((c - 'a' + 1) % 26 + 'a'));
        }
        // System.out.println(map);
        int i = 0; 
        int j = 0;

        while (i < len1 && j < len2) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } 
            else {
                char nextChar = map.get(str1.charAt(i));
                if (nextChar == str2.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
        }

        return j == len2;
}

}