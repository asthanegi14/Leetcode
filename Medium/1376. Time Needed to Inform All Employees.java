class Solution {
    public int dfs(HashMap<Integer, List<Integer>> map, int h, int[] it){
        int max=0;

        if(!map.containsKey(h)){
            return max;
        }

        for(int e: map.get(h)){
            max = Math.max(max, dfs(map, e, it));
        }

        return max+it[h];
    }
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(manager[i])){
                map.put(manager[i], new ArrayList<>());
            }
            map.get(manager[i]).add(i);
        } 
        // System.out.println(map);
        return dfs(map, headID, informTime);
    }
}
