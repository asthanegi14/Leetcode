class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length, max=Integer.MIN_VALUE;
        int a[][] = new int[n][1001];

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int diff = nums[j]-nums[i]+500;
                a[i][diff] = a[j][diff]+1;
                max = Math.max(max, a[i][diff]);
            }
        }
        return max+1;
    }
}
