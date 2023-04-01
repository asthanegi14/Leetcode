class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);        
        Arrays.sort(nums2);
        int s1 = nums1[0];
        int s2 = nums2[0];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int min1=0, min2=0;
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                return nums2[i];
            }
        }
        if(s1<s2){
            return s1*10+s2;
        }
        else
        return s2*10+s1;
    }
}
