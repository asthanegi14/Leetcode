class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[26];
        for(int i=0;i<order.length();i++){
            dic[order.charAt(i)-'a'] = i;
        }

        boolean ans = false;

        for(int i=1;i<words.length;i++){
            int n = Math.min(words[i].length(), words[i-1].length());

            for(int j=0;j<n;j++){
                if(dic[words[i].charAt(j)-'a'] > dic[words[i-1].charAt(j) - 'a']){
                    ans = true;
                    break;
                }
                if(dic[words[i].charAt(j)-'a'] < dic[words[i-1].charAt(j)-'a']){
                    return false;
                }
            }
            if(!ans && words[i].length()<words[i-1].length()){
                return false;
            }
        }
        return true;
    }
}
