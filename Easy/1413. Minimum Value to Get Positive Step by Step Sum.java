class Solution {    
    public boolean find(int guess, int[] nums){
        int num = 0;
        // System.out.println("mid = "+guess);

        for(int i=0;i<nums.length;i++){
            num = guess+nums[i];
            guess = num;
            if(num<1){
                return true;
            }
        }
        return false;
    }
    public int minStartValue(int[] nums) {
        int i=1, m=100, n=nums.length, mid=0;
        int e=m*n+1;

        while(i<e){
            // System.out.println("i="+i+" n="+n);
            mid = (i+e)/2;
            boolean ret = find(mid, nums);

            if(ret){
                i = mid+1;
            }
            else{
                e = mid;
            }
        }
        return find(mid, nums)?i:e;
    }
}
