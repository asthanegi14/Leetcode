class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int sum=0;

        for(i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}
