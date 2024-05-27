class Solution {
    public int count(int k, int[] a){
        int ans=0;
        for(int i:a){
            if(i>=k){
                ans++;
            }
        }
        return ans;
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int i=0, n=nums.length;
        
        while(i<=n){
            int mid = (n-i)+i/2;
            int ans = count(mid, nums);
            
            if(ans==mid){
                return mid;
            }
            else if(ans>mid){
                i=mid+1;
            }
            else{
                n=mid-1;
            }
        }
        
        return -1; 
    }
}