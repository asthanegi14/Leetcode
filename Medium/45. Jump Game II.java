class Solution {
    public int jump(int[] nums) {
        int j=0, max=0, count=0, curr=0;
        for(int i=0;i<nums.length-1;i++){
            j+=nums[i];
            max = Math.max(max,j+i);
            if(i==curr){
                count++;
                curr = max;
            }
            j=0;
        }
        return count;
    }
}
