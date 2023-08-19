class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                if(i!=j){
                   if((nums.get(i)+nums.get(j))<target){
                       count++;
                   } 
                }
            }
        }
        return count;
    }
}