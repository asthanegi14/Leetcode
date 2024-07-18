class Solution {
    public Map<Integer, Integer> find(TreeNode root, int dis, int[] ans){
        Map<Integer, Integer> map = new HashMap<>();
        
        if(root == null){
            return map;
        }
        
        if(root.left == null && root.right == null){
            map.put(1, 1);
            return map;
        }
        
        Map<Integer, Integer> l = find(root.left, dis, ans);        
        Map<Integer, Integer> r = find(root.right, dis, ans);
        
        for(int i : l.keySet()){
            for(int j : r.keySet()){
                if(i + j <= dis){
                    ans[0] += l.get(i) * r.get(j);
                }
            }
        }
        
        for(int i : l.keySet()){
            if(i + 1 <= dis){
                map.put(i + 1, l.getOrDefault(i, 0));
            }
        }
        
        for(int j : r.keySet()){
            if(j + 1 <= dis){
                map.put(j + 1, map.getOrDefault(j + 1, 0) + r.getOrDefault(j, 0));
            }
        }
        
        return map;
    }
    
    public int countPairs(TreeNode root, int distance) {
        int[] ans = new int[1];
        find(root, distance, ans);
        return ans[0];
    }
}
