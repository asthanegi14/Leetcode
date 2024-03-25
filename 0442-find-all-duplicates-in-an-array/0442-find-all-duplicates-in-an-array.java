class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums){
            if(set.contains(i)){
                ans.add(i);
            }
            set.add(i);
        }
        
        return ans;
    }
}