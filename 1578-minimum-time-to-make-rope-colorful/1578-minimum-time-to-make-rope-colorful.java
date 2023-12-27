class Solution {
    public int minCost(String colors, int[] neededTime) {
        char c = colors.charAt(0);
        int sum=0, max=neededTime[0];
        
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==c){
                if(neededTime[i]>max){                    
                    sum+=max;
                    max = neededTime[i];
                }
                else{
                    sum += neededTime[i];
                }
            }
            else{
                c = colors.charAt(i);
                max = neededTime[i];
            }
        }
        return sum;
    }
}