class Solution {
    public void find(int[] a, int i, List<Integer> l, List<List<Integer>> ans){
        // if(!ans.contains(l)){
            ans.add(new ArrayList<>(l));
        // }
        
        for(int j=i;j<a.length;j++){
            l.add(a[j]);
            find(a, j+1, l, ans);
            l.remove(l.size()-1); 
        }
        
        // System.out.println("i = "+i+" l = "+l+" ans = "+ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        find(nums, 0, new ArrayList<>(), ans);
        
        return ans;
    }
}