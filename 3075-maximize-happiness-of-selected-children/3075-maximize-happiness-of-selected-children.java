class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i=happiness.length-1, j=0, n = happiness.length;
        long ans = 0;
        
        while(k-->0){
            int num = happiness[i]-j;
            if(num>=0){
                ans+=num;
            }
            else{
                break;
            }
            
            i--; j++;
        }
        
        return ans;
    }
}