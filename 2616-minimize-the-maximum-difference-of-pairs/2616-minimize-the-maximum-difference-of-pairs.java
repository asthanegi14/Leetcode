class Solution {
    public boolean find(int[] nums, int mid, int p){
        int c=0;
        for(int i=0;i<nums.length-1 && c<p;){
            if(nums[i+1]-nums[i]<=mid){
                c++;
                i+=2;
            }
            else{
                i++;
            }
        }
        return c>=p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0, r=nums[nums.length-1]-nums[0];
        
        while(l<r){
            int mid = (l+r)/2;
            if(find(nums, mid, p)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}