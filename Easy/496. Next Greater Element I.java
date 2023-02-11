class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                int num = st.pop();
                map.put(num, nums2[i]);
            }
            st.push(nums2[i]);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }
        }

        return ans;
    }
}
