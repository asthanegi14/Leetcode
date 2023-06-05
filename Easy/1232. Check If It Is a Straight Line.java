class Solution {
    public boolean checkStraightLine(int[][] c) {
        int n=c.length;

        if(n<=2){
            return true;
        }
        int a = c[1][0] - c[0][0];
        int b = c[1][1] - c[0][1];
        
        for(int i=2;i<n;i++){
            int x = c[i][0], y = c[i][1];

            if(a*(y-c[1][1]) != b*(x-c[1][0])){
                return false;
            }
        }

        return true;
    }
}
