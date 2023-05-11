class Solution {
    // public int find(int[] nums1, int[] nums2, int i, int j, int count, int[][] ans){
    //     if(i==nums1.length || j==nums2.length){
    //         return 0;
    //     }
    //     if(ans[i][j]!=0){
    //         return ans[i][j];
    //     }
    //     if(nums1[i] == nums2[j]){
    //         count+= 1+find(nums1, nums2, i+1, j+1, count, ans);
    //     }
    //     else{
    //         count += Math.max(find(nums1, nums2, i, j+1, count, ans), find(nums1, nums2, i+1, j, count, ans));
    //     }
    //     ans[i][j] = count;
    //     return count;
    // }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int count=0;
        int[][] ans= new int[nums1.length+1][nums2.length+1];

        // return find(nums1, nums2, 0,0, count, ans);
        int a = nums1.length, b = nums2.length;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(nums1[i]==nums2[j]){
                    ans[i+1][j+1] = ans[i][j]+1;
                }
                else{
                    ans[i+1][j+1] = Math.max(ans[i+1][j] , ans[i][j+1]);
                }
            }
        }
        return ans[a][b];
    }
}
