class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i:nums1){
            pq.add(new int[]{i+nums2[0], 0});
        }

        while(k>0 && !pq.isEmpty()){
            int[] pair = pq.poll();
            int sum = pair[0];
            int curr = pair[1];

            List<Integer> temp = new ArrayList<>();
            temp.add(sum-nums2[curr]);
            temp.add(nums2[curr]);
            arr.add(temp);

            if(curr+1<nums2.length){
                pq.add(new int[]{sum-nums2[curr] + nums2[curr+1], curr+1});
            }
            k--;
        }
        return arr;
    }
}
