class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int[] freq = new int[26];
        
        for(int i=0;i<words[0].length();i++){
            freq[words[0].charAt(i)-'a']++;
        }
        
        for(int i=1;i<words.length;i++){
            int[] temp = new int[26];
            
            for(int j=0;j<words[i].length();j++){
                temp[words[i].charAt(j)-'a']++;
            }
            
            for(int j=0;j<26;j++){
                if(temp[j]<freq[j]){
                    freq[j] = temp[j];
                }
            }
        }
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i]; j++) {
                ans.add(Character.toString((char) ('a' + i)));
            }
        }
        return ans;
    }
}