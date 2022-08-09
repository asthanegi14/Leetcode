class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        //According to hints (T+1)^x >= N, where T is possible tests, x is the number of pigs, N is total no. of buckets
        int T = minutesToTest / minutesToDie;
        int x=0;
        while(Math.pow(T+1,x)<buckets){
            x++;
        }
        return x;
    }
}
