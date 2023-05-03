class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map1 =  new HashMap<>();
        HashMap<Integer, Integer> map2 =  new HashMap<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        for(int i:nums1){
            map1.put(i, 1);
        }
        for(int i:nums2){
            map2.put(i, 1);
        }
        // System.out.println(map1);
        // System.out.println(map2);

        for(Map.Entry<Integer, Integer> e: map1.entrySet()){
            if(map2.containsKey(e.getKey())){
                map2.remove(e.getKey());
                map1.getOrDefault(e.getKey(), 0);
            }
            else{
                a1.add(e.getKey());
            }
        }
        // System.out.println(map1);
        // for(Map.Entry<Integer, Integer> e: map1.entrySet()){
        //     if(e.getValue()>0){
        //         a1.add(e.getKey());
        //     }
        // }
        for(Map.Entry<Integer, Integer> e: map2.entrySet()){
            a2.add(e.getKey());
        }
        // System.out.println(map2);

        ans.add(a1);
        ans.add(a2);
        return ans;
    }
}
