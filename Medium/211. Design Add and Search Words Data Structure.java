class WordDictionary {
    WordDictionary[] num;
    boolean flag;

    public WordDictionary() {
        num = new WordDictionary[26];
        flag = false;
    }
    
    public void addWord(String word) {
        
        WordDictionary node = this;
        for(char c: word.toCharArray()){
            if(node.num[c-'a'] == null){
                node.num[c-'a'] = new WordDictionary();
            }
            node = node.num[c-'a'];
        }
        node.flag = true;
    }
    
    public boolean search(String word) {
        
        WordDictionary node = this;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(WordDictionary n: node.num){
                    if(n!=null && n.search(word.substring(i+1))){
                        return true;
                    }
                }
                return false;
            }
            if(node.num[c-'a'] == null){
                return false;
            }
            node = node.num[c-'a'];
        }
        return node != null && node.flag;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
