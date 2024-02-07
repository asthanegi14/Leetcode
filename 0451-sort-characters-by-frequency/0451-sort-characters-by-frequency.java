class Solution {
    class Pair implements Comparable<Pair>{
        int freq;
        char c;
        
        Pair(int freq, char c){
            this.freq = freq;
            this.c = c;
        }
        
        public int compareTo(Pair p){
            return this.freq-p.freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(Character c:map.keySet()){
            int fre = map.get(c);
            pq.add(new Pair(fre, c));
        }

        while(!pq.isEmpty()){
            Pair pop = pq.poll();
            while(pop.freq-->0){
                sb.insert(0, pop.c);
            }
        }
        return sb.toString();
    }
}