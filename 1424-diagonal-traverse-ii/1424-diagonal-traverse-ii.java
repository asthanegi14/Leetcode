class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size=0;
        List<List<Integer>> a = new ArrayList<>();
        
        for(int i=0;i<nums.size();i++){
            List<Integer> r = nums.get(i);
            
            for(int j=0;j<r.size();j++){
                int idx = i+j;
                
                if(a.size()<idx+1){
                    a.add(new ArrayList<>());
                }
                a.get(idx).add(r.get(j));
                
                size++;
            }
        }
        
        int[] ans = new int[size];
        int idx=0;
        
        for(List<Integer> x:a){
            for(int i=x.size()-1;i>=0;i--){
                ans[idx++] = x.get(i);
            }
        }
        
        return ans;
        
        
    }
}