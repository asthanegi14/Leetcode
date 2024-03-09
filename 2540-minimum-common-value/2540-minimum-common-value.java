class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        
        while(i<nums1.length && j<nums2.length){
            int a = nums1[i];
            int b = nums2[j];
            
            if(a==b){
                return a;
            }
            else if(a<b){
                i++;
            }
            else{
                j++;
            }
        }
        
        return -1;
    }
}