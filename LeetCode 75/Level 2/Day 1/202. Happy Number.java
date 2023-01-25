class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        h.add(n);
        while(n!=1){
            int sum = 0;
            while(n!=0){
                sum += Math.pow(n%10,2);
                n/=10;
            }

            if(h.contains(sum)){
                return false;
            }
            h.add(sum);
            n=sum;
        }
        return true;

    }
}
