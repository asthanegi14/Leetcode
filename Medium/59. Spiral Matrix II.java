class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int i=0, j=0, top=n-1, btm=n-1;
        int num=1;
        while(i<=top && j<=btm){
            for(int k=i;k<=top;k++){
                arr[i][k] = num;
                num++;
            }
            j++;
            for(int k=j;k<=btm;k++){
                arr[k][top] = num;
                num++;
            }
            top--;

            if(j<=btm){
                for(int k=top;k>=i;k--){
                    arr[btm][k] = num;
                    num++;
                }
            }
            btm--;
            
            if(i<=top){
                for(int k=btm;k>=j;k--){
                    arr[k][i] = num;
                    num++;
                }
            }

            i++;
        }
        return arr;
    }
}
