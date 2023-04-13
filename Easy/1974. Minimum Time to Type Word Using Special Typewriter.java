class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        char pre = 'a';
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int diff = Math.abs(c-pre);
            int diff2 = 26 - Math.abs(c-pre);
            ans+=Math.min(diff, diff2)+1;
            pre = c;
        }

        return ans;
    }
}
