class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        while(a!=0 || b!=0 || c!=0){
            int x = a&1;
            int y = b&1;
            int z = c&1;

            if(z==0){
                count+=(x+y);
            }
            else{
                if(x==0 && y==0){
                    count++;
                }
            }

            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return count;
    }
}
