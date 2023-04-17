class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> res = new ArrayList<>();

        for(int i:candies){
            max=Math.max(max, i);
        }

        for(int i=0;i<candies.length;i++){
            int num = candies[i]+extraCandies;

            if(num>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}
