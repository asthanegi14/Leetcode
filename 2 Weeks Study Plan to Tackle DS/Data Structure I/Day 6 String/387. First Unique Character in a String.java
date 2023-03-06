class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c)==1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
