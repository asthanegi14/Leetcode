class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> a = new HashMap<>();
        for(String s : words){
            a.put(s,a.getOrDefault(s,0)+1);
        }
        Queue<String> q = new PriorityQueue<>();
        a.forEach((x,y)->q.add(String.format("%03d%s",500-y,x)));
        // System.out.print(q+" ");
        List<String> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(q.poll().substring(3));
            System.out.print(res+" ");
        }
        return res;
    }
}
