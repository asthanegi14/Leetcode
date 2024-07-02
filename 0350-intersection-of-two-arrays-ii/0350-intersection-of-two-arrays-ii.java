class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> a = new ArrayList<>();
        int i=0, j=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                a.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        j=0;
        int[] ans = new int[a.size()];
        for(int k:a){
            ans[j++]=k;
        }
        
        return ans;
    }
}