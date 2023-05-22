class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        // Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        pq.addAll(map.keySet());
        int j=0;
        // System.out.println(map);

        // for(Map.Entry<Integer, Integer> e: map.entrySet()){
        //     // System.out.println("k="+k+" key="+e.getKey());
        //     if(k!=0){
        //         ans[j++] = e.getKey();
        //     }
        //     k--;
        //     if(k==0){
        //         break;
        //     }
        // }
        for(int i=0;i<k;i++){
            ans[j++] = pq.remove();
        }
        return ans;
    }
}
