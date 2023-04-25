class Solution {
    public List<String> findSubs(List<String> ans,String str){
        ArrayList<String> st = new ArrayList<>();
        
        for(int i=0;i<str.length();i++){
            for(String s: ans){
                st.add(s+str.charAt(i)); 
            }
        }
        return st;
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");map.put('3', "def");map.put('4', "ghi");map.put('5', "jkl");
        map.put('6', "mno");map.put('7', "pqrs");map.put('8', "tuv");map.put('9', "wxyz");

        if(digits.length()==1){
            String[] c = map.get(digits.charAt(0)).split("");
            for(String ch: c){
                ans.add(ch);
            }
            return ans;
        }

        int i=0;
        ans.add("");
        while(i<digits.length()){
            ans = findSubs(ans, map.get(digits.charAt(i)));
            i++;
        }
        // System.out.println(st);

        // findSubs(ans, st);
        return ans;
    }
}
