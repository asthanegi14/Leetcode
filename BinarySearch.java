class Solution {
    int leftsearch(int[] nums,int t)
    {
        for(int j=0;j<nums.length/2;j++)
        {
            if(t==nums[j])
            {
                return j;
            }
        }
        return -1;
    }
    int rightsearch(int[] nums, int t)
    {
        for(int j=nums.length/2;j<nums.length;j++)
        {
            if(t==nums[j])
            {
                return j;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        if(target==nums[mid])
        {
            return mid;
        }
        else if(target<nums[mid])
        {
            return leftsearch(nums,target);
        }
        else if(target>nums[mid])
        {
            return rightsearch(nums,target);
        }
        return 0;
    }
}
