class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int n=nums.length-1;
        while(i<=n)
        {
            int mid = i+(n-i)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                n=mid-1;
            else
                i=mid+1;
        }
        return i;
    }
}
