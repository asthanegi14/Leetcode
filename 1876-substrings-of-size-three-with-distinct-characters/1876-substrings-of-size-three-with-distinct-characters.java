class Solution {
    public int countGoodSubstrings(String s) {
        int count=0, i=0, k=3, n=s.length(), ans=0, ttl=0;
        while(i<n-2){
            ttl++;
            String sub = s.substring(i, i+k);
            HashSet<Character> map = new HashSet<>();
            // System.out.println(sub);
            count=0;
            for(int j=0;j<3;j++){
                // System.out.println(sub.charAt(j));
                if(map.contains(sub.charAt(j))){
                    count++;
                    // System.out.println("count = "+count);
                    break;
                }
                else{
                    map.add(sub.charAt(j));
                }
            }
            ans = Math.max(count+ans, count);
            i++;
        }
        return ttl-ans;
    }
}