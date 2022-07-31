class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> n = new HashMap<>();
        int ans = 0;
        for(int i:nums)
        {
            int x = n.getOrDefault(i,0);
            n.put(i,x+1);
        }
        for(int i:n.values())
        {
            if(i>1)

            {
                ans += ((i-1)*i)/2;   
            }
        }
        return ans;
    }
}
