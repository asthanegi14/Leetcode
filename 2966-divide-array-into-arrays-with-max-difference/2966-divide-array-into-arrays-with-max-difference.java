class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        
        while(i<nums.length){
            int l = i, r = i+1;
            while(r<nums.length && nums[r]-nums[l]<=k && r-l<3){
                r++;
            }
            if(r-l<3){
                return new int[0][0];
            }
            
            ans.add(Arrays.copyOfRange(nums, l, r));
            i = r;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}