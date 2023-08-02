class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void find(int[] nums, int[] per, int c) {
        if (c == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : per) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (per[i] == 11) {
                per[i] = nums[c];
                find(nums, per, c + 1);
                per[i] = 11;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=11;
        }
        
        find(nums, p, 0);
        return ans;
        
    }
}