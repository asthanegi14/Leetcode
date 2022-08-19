class Solution {
    public int[] result(int[] nums,int target,int i,int n)
    {
        int f=-1,l=-1;
        int[] re = {-1,-1};
        while(i<=n)
        {
            int mid = i+(n-i)/2;
            if(nums[mid] == target)
            {
                f=mid;
                n=mid-1;
            }
            else if(nums[mid] > target)
            {
                n=mid-1;
            }
            else
            {
                i=mid+1;
            }   
        }
        i=0;n=nums.length-1;
         while(i<=n)
        {
            int mid = i+(n-i)/2;
            if(nums[mid] == target)
            {
                l=mid;
                i=mid+1;
            }
            else if(nums[mid] > target)
            {
                n=mid-1;
            }
            else
            {
                i=mid+1;
            }   
        }
        re[0] = f;
        re[1] = l;
        return re;
    }
    public int[] searchRange(int[] nums, int target) {   
        return result(nums,target,0,nums.length-1);
    }
}
