class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=1,n=nums.length-1;

        while(i<n){
            int mid=i+(n-i)/2;
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<=mid){
                    count++;
                }
            }
            if(count<=mid){
                i=mid+1;
            }
            else{
                n=mid;
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     ans = find(nums,nums[i]);
        //     if(i!=ans){
        //         ret = nums[i];
        //     }
        // }
        return i;
    }
}
