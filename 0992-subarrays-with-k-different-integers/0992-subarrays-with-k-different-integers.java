class Solution {
    public int find(int[] a, int k){
        int j=0, ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            if(map.getOrDefault(a[i], 0) == 0){
                k--;
            }
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            
            while(k<0){
                map.put(a[j], map.getOrDefault(a[j], 0)-1);
                if(map.get(a[j]) == 0){
                    k++;
                }
                j++;
            }
            
            ans += i-j+1;
        }
        
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return find(nums, k) - find(nums, k-1);
    }
}