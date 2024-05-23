class Solution {
    public void find(int[] nums, int k, int i, List<Integer> a, List<List<Integer>> l){
        if(i==nums.length){
            if(a.size()>0){
                l.add(new ArrayList<>(a));
            }
            return;
        }
        
        if(!a.contains(nums[i]-k)){
            a.add(nums[i]);
            find(nums, k, i+1, a, l);
            a.remove(a.size()-1);
        }
        
        find(nums, k, i+1, a, l);
    }
    
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        find(nums, k, 0, new ArrayList<>(), l);
        
        return l.size();
    }
}