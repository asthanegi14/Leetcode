class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length()==1){
            return 1;
        }
        int count=0, ans=0;
        int i=0,j=0;
        
        while(j<s.length()){
            char c = s.charAt(j);
            // System.out.println("c = "+c);
            if(map.containsKey(c)){
                i++;
                j=i;
               ans=Math.max(ans,map.size());
               map.clear();
            }
            else{
                map.put(c,1);
                j++;
            }
            ans=Math.max(ans,map.size());
            // System.out.println("i = "+i+" j = "+j+" ans = "+ans);
            // System.out.println(map);
        }
        return ans;
    }
}
