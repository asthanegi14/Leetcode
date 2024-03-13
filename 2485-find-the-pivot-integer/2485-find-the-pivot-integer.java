class Solution {
    public int pivotInteger(int n) {
        int i=1, sum1=1, sum2=n;
        
        while(i<n){
            // System.out.println("sum1 = "+sum1+" sum2 = "+sum2+" i="+i+" n="+n);
            if(sum1<sum2){
                i++;
                sum1+=i;
            }
            else if(sum1>sum2){
                n--;
                sum2+=n;
            }
            else{
                i++;n--;
                sum1+=i;
                sum2+=n;
            }
        }
            // System.out.println("sum1 = "+sum1+" sum2 = "+sum2+" i="+i+" n="+n);
        if(sum1==sum2 && i==n){
            return i;
        }
        return -1;
    }
}