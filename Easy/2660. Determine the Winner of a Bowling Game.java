class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0, sum2=0;
        int[] a = new int[player1.length];        
        int[] b = new int[player2.length];
        
        for(int i=0;i<player1.length;i++){
            if(i==0){
                a[0]=player1[0];
                b[0]=player2[0];
                continue;
            }
            if(i==1){
                if(player1[0]==10){
                    a[1] = player1[1]*2;

                }
                else{
                    a[1] = player1[1];
                }
                if(player2[0]==10){
                    b[1] = player2[1]*2;
                } 
                else{
                    b[1] = player2[1];
                }
            }
            else{
                if(player1[i-1]==10 || player1[i-2]==10){
                    a[i] = player1[i]*2;
                }
                else{
                    a[i] = player1[i];
                }
                if(player2[i-1]==10 || player2[i-2]==10){
                    b[i] = player2[i]*2;
                }
                else{
                    b[i] = player2[i];
                }
            }
        }
        for(int i:a){
            sum1+=i;
        }
        for(int i:b){
            sum2+=i;            
        }
        if(sum1>sum2){
            return 1;
        }
        if(sum1<sum2){
            return 2;
        }
        return 0;
    }
}
