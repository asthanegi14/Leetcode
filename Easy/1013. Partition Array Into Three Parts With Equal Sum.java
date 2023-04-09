class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;

        for(int i:arr){
            sum+=i;
        }

        if(sum%3!=0){
            return false;
        }
        int target = sum/3;
        int seg = 0;

        int resSum=0;
        for(int i:arr){
            resSum+=i;

            if(resSum==target && seg!=3){
                seg++;
                resSum=0;
            }
        }

        if(seg==3){
            return true;
        }
        return false;
    }
}
