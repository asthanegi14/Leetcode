class Solution {
    private Set<String> words;    //contains wordList
    private String beginWord;
    private String endWord;
    
    private Map<String, List<String>> par = new HashMap<>();
    private List<List<String>> ans = new ArrayList<>();
    
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        this.words = new HashSet(wordList);
        words.add(beginWord);
        
        if (!words.contains(endWord)) return ans;
        this.beginWord = beginWord;
        this.endWord = endWord;
        
        if (!build()) return ans;
  
        List<String> curr = new ArrayList<>();
        curr.add(beginWord);
        
        allPaths(beginWord, curr);
        
        return ans;
    }
    
    private void allPaths(String s, List<String> curr) {
        if (s.equals(endWord)) {
            ans.add(new ArrayList(curr));
            return;
        }
        
        for (String n : par.get(s)) {
            curr.add(n);
            allPaths(n, curr);
            curr.remove(curr.size() - 1);
        }
    }
    
 
    private boolean build() {
        Set<String> back = new HashSet<>();
        back.add(endWord);
        
        Set<String> vis = new HashSet<>();
        boolean found = false;
        
        while (!back.isEmpty() && !found) {
            Set<String> temp = new HashSet<>();
            
            for (String s : back) {
                vis.add(s);
   
                for (String nb : getNext(s)) {
                    
                    if (back.contains(nb) || vis.contains(nb)) continue;
                    if (beginWord.equals(nb)) found = true;

                    temp.add(nb);
                    par.putIfAbsent(nb, new ArrayList<>());
                    par.get(nb).add(s);
                }
            }
            back = temp;
        }
        return found;
    }
    
    private List<String> getNext(String s) {
        char[] arr = s.toCharArray();
        List<String> nbs = new ArrayList<>();
   
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == ch) continue;
                arr[i] = c;
                String nb = new String(arr);
                if (words.contains(nb)) nbs.add(nb);
            }
            arr[i] = ch;
        }
        
        return nbs;
    }
}
