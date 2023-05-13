class Solution {
    int a=0, b=0;
    public int find(int[] nums, int i, int[] a){
        if(i<0){
            return 0;
        }
        if(a[i]!=-1){
            return a[i];
        }

        a[i] = Math.max(find(nums, i-1, a) , find(nums, i-2, a)+nums[i]);
        return a[i];
    }
    public int rob(int[] nums) {
        int[] a = new int[nums.length];
        Arrays.fill(a, -1);
        return find(nums, nums.length-1, a);
    }
}
