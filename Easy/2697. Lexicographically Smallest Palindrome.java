class Solution {
    public String makeSmallestPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder f = new StringBuilder();
        StringBuilder l = new StringBuilder();

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (c1 == c2) {
                f.append(c1);
                l.append(c1);
                i++;
                j--;
            } else if (c1 < c2) {
                f.append(c1);
                l.append(c1);
                i++;
                j--;
            } else {
                f.append(c2);
                l.append(c2);
                j--;
                i++;
            }
        }

        if (s.length() % 2 != 0) {
            char mid = s.charAt(s.length() / 2);
            return f.append(mid).append(l.reverse()).toString();
        } else {
            return f.append(l.reverse()).toString();
        }
    }
}
