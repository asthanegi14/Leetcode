class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        if(fb.length==1){
            if(fb[0]==0 && n<=1){
                return true;
            }
            else if(fb[0]==0 && n>1){
                return false;
            }
            if(fb[0]==1 && n>=1){
                return false;
            }
        }

        int i=0;
        while(i<fb.length && n!=0){

            //base case 1
            if(i==0){
                if(fb[i]==0 && fb[i+1]!=1){
                    n--;
                    fb[i]=1;
                }
            }

            //base case 2
            if(i==fb.length-1){
                if(fb[i]==0 && fb[i-1]!=1){
                    n--;
                    fb[i]=1;
                }
            }

            //other cases
            if(fb[i]==0){
                if((i-1)>=0 && ((i+1)<fb.length) && fb[i-1]!=1 && fb[i+1]!=1){
                    n--;
                    fb[i]=1;
                }
            }
            i++;
        }

        if(n!=0){
            return false;
        }
        return true;
    }
}
