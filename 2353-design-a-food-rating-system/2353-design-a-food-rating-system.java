class FoodRatings {
    class Pair{
        String food, cus;
        int rating;
        
        public Pair(String food, String cus, int rating){
            this.food = food;
            this.cus = cus;
            this.rating = rating;
        }
    }
    
    Map<String, PriorityQueue<Pair>> c;
    Map<String, Pair> f;
    
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        c = new HashMap<>();
        f = new HashMap<>();
        
        for(int i=0;i<foods.length;i++){
            Pair p = new Pair(foods[i], cuisines[i], ratings[i]);
            f.put(foods[i], p);
            
            if(c.containsKey(cuisines[i])){
                c.get(cuisines[i]).add(p);
            }
            else{
                PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
                    @Override
                    public int compare(Pair a, Pair b){
                        int ans = b.rating-a.rating;
                        
                        if(ans==0){
                            return (a.food).compareTo(b.food);
                        }
                        
                        return ans;
                    }
                });
                pq.add(p);
                c.put(cuisines[i], pq);
            }
        }
    }
    
    public void changeRating(String food, int newRating) {
        Pair pre = f.get(food);
        Pair temp = new Pair(food, pre.cus, newRating);
        f.put(food, temp);
        pre.food = "";
        c.get(pre.cus).add(temp);
    }
    
    public String highestRated(String cuisine) {
        while(c.get(cuisine).peek().food.equals("")){
            c.get(cuisine).remove();
        }
        
        return c.get(cuisine).peek().food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */