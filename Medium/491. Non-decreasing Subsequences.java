class Solution {
    Set<List<Integer>> ans;
    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new HashSet<>();
        subarray(0,nums,new ArrayList());
        return new ArrayList(ans);
    }
    public void subarray(int k, int[] nums, List<Integer> a){
        if(a.size()>=2){
            ans.add(new ArrayList(a));
        }
        for(int i=k;i<nums.length;i++){
            if(a.size()==0 || a.get(a.size()-1)<=nums[i]){
                a.add(nums[i]);
                subarray(i+1,nums,a);
                a.remove(a.size()-1);
            }
        }
    }
}
