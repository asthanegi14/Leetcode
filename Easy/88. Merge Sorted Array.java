class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x1 = m-1;
        int x2 = n-1;
        int i=m+n-1;
        while(x2>=0)
        {
            if(x1>=0 && nums2[x2]<nums1[x1])
            {
                nums1[i]=nums1[x1];
                x1--;i--;
            }
            else
            {
                nums1[i]=nums2[x2];
                x2--;i--;
            }
                
        }
    }
}
