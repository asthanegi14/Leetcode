class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int i=1, n=nums[0], j=nums.length-2, m=nums[nums.length-1];

        if(nums.length<=2){
            return 0;
        }

        while(i<nums.length && nums[i]==n){
            i++;
        }
        while(j>=0 && nums[j]==m){
            j--;
        }
        int count=0;
        while(i<=j){
            count++;
            i++;
        }
        return count;
    }
}
