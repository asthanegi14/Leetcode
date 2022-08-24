class Solution {
    public int firstUniqChar(String s) {
        int ans=-1;
        Map<Character,Integer> str = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            str.put(c,str.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(str.get(c)==1){
                ans = i;
                break;
            }
        }
        // System.out.println("str = "+str);
        return ans;
    }
}
