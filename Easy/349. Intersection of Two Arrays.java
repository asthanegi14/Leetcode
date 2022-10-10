class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],1));
        }

        for(int i=0;i<nums2.length;i++){
            if((map.containsKey(nums2[i])) && (ans.contains(nums2[i])==false)){
                ans.add(nums2[i]);
            }
        }
        int[] ret = new int[ans.size()];
        int j=0;
        for(int i:ans){
            ret[j]=i;
            j++;
        }
        return ret;
    }
}
