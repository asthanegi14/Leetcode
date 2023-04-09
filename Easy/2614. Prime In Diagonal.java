class Solution {
    public boolean isPrime(int i){
        if(i==0 || i==1){
            return false;
        }
        
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                max = Math.max(max, nums[i][i]);
            }
        }
        for(int i=0;i<nums[0].length;i++){
            if(isPrime(nums[i][nums[i].length-i-1])){
                max = Math.max(max, nums[i][nums[i].length-i-1]);
            }
        }
        
        return max == Integer.MIN_VALUE? 0: max;
    }
}
