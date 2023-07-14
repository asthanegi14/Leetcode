class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int n = arr[i];
            if(map.containsKey(n-diff)){
                map.put(n, map.getOrDefault((n-diff), 0)+1);
            }
            else{
                map.put(n , 1);
            }
            ans = Math.max(ans, map.get(n));
        }
        return ans;
    }
}
