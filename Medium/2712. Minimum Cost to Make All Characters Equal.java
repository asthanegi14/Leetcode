class Solution {
    public long minimumCost(String s) {
        long ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                long count=s.length()-i-1;
                ans+=Math.min(i+1, count);
            }
        }
        return ans;
    }
}
