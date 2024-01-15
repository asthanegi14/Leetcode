class Solution {
    public List<List<Integer>> findWinners(int[][] m) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> unq = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int[] i:m){
            set.add(i[1]);
            unq.add(i[0]);            
            unq.add(i[1]);
            map.put(i[1], map.getOrDefault(i[1], 0)+1);
        }
        List<Integer> a = new ArrayList<>();        
        List<Integer> b = new ArrayList<>();
        
        for(int i:unq){
            if(!set.contains(i)){
                a.add(i);
            }
        }
        
        for(int i: map.keySet()){
            if(map.get(i)==1){
                b.add(i);
            }
        }
        Collections.sort(a);        
        Collections.sort(b);

        ans.add(a);
        ans.add(b);
        return ans;
    }
}