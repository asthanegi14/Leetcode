class Solution {
    int find(int[] rods, int i, int d, int sum, HashMap<String, Integer> map){
        if(i==rods.length){
            return d==0?0:Integer.MIN_VALUE;
        }

        String s = i+"+"+d;
        if(map.containsKey(s)){
            return map.get(s);
        }
        int ex = find(rods, i+1, d, sum, map);

        int t = find(rods, i+1, d+rods[i], sum, map)+rods[i];

        int sh = find(rods, i+1, d-rods[i], sum, map);

        int max = Math.max(ex, Math.max(t, sh));

        map.put(s, max);

        return max;
    }
    public int tallestBillboard(int[] rods) {
        HashMap<String, Integer> map = new HashMap<>();
        int sum=0;
        for(int i: rods){
            sum+=i;
        }

        return find(rods, 0, 0 , sum, map);
    }
}
