class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        //Brute Force 
        // int i=0;
        // int j=i+1;
        // int count=0, s=0;
        // while(i<time.length && s!=time.length-1){
        //     int sum=0;
        //     if(j==time.length){
        //         i++;
        //         j=i+1;
        //         s++;
        //     }
        //     if(i<time.length && j<time.length){
        //         sum = time[i]+time[j];
        //     }

        //     if(sum!=0 && sum%60==0){
        //         count++;
        //     }
        //     j++;
        // }


        //Optimized
        //Keep this in mind that if a number X%60==0 & Y%60==0 then there sum will also be divisible by 60
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;

        for(int i=0;i<time.length;i++){
            int mod = time[i]%60;
            if(mod==0){
                count+=map.getOrDefault(0,0);
            }
            else{
                count+=map.getOrDefault(Math.abs(60-mod),0);
            }
            map.put(mod, map.getOrDefault(mod,0)+1);
        }
        return count; 
    }
}
