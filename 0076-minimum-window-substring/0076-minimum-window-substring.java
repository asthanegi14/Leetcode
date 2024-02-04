class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int n=s.length(), m=t.length();
        
        int ans=Integer.MAX_VALUE, i=0;
        
        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int count=map.size(), j=0, k=0;
        
        while(k<s.length()){
            map.put(s.charAt(k), map.getOrDefault(s.charAt(k), 0)-1);
            if(map.get(s.charAt(k))==0){
                count--;
            }
            
            if(count==0){
                while(count==0){
                    if(ans>k-j+1){
                        ans = k-j+1;
                        i=j;
                    }
                    
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
                    if(map.get(s.charAt(j))>0){
                        count++;
                    }
                    j++;
                }
            }
            k++;
        }
        if(ans==Integer.MAX_VALUE){
            return "";
        }
        
        return s.substring(i, i+ans); 
    }
}