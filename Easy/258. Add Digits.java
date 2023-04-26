class Solution {
    public int find(int num){
        int sum=0;
        while(num>0){
            int d = num%10;
            sum+=d;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>9){
            num = find(num);
        }

        return num;
    }
}
