class Pair{
    String n;
    int t;

    Pair(String n, int t){
        this.n=n;
        this.t=t;
    }
}
class Trav{
    int total;
    int count;

    Trav(int total, int count){
        this.total = total;
        this.count = count;
    }
}
class UndergroundSystem {
    HashMap<Integer, Pair> map;
    HashMap<String, Trav> info;

    public UndergroundSystem() {
        map = new HashMap<>();
        info = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id, new Pair(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair p = map.remove(id);
        String s = p.n+","+stationName;

        int time = t-p.t;

        if(info.containsKey(s)){
            Trav tt = info.get(s);
            tt.total += time;
            tt.count++;
        }
        else{
            info.put(s, new Trav(time, 1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String s = startStation+","+endStation;
        Trav t = info.get(s);
        return (double)t.total/t.count;
    }
}
