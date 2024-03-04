class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int ans=0, p=0, i=0, j=tokens.length-1;
        
        while(i<=j){
            if(power>=tokens[i]){
                power -= tokens[i++];
                ans = Math.max(ans, ++p);
            }
            else if(p>0){
                p--;
                power += tokens[j--];
            }
            else{
                break;
            }
        }
        
        return ans;
    }
}