class Solution {
    public int mergeSort(int lo,int mid, int hi, int[] nums){
        int j=mid+1,count=0;
        for(int i=lo;i<=mid;i++){
            while(j<=hi && nums[i]>(2*(long)nums[j])){
                j++;
            }
            count+=(j-(mid+1));
        }
        
        ArrayList<Integer> t = new ArrayList<>();
        int l=lo, r=mid+1;
        while(l<=mid && r<=hi){
            if(nums[l]<=nums[r]){
                t.add(nums[l++]);
            }
            else{
                t.add(nums[r++]);
            }
        }
        while(l<=mid){
            t.add(nums[l++]);
        }
        while(r<=hi){
            t.add(nums[r++]);
        }
        
        for(int i=lo;i<=hi;i++){
            nums[i]=t.get(i-lo);
        }
        return count;
    }
    public int merge(int i, int n, int[] nums){
        int ans=0;
        if(i<n){
            int mid=(n+i)/2;
            ans+=merge(i,mid,nums);
            ans+=merge(mid+1,n,nums);
            ans+=mergeSort(i,mid,n,nums);
        }
        return ans;
    }
    public int reversePairs(int[] nums) {
        //TC: O(n*n)
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((long)nums[i]>(long)nums[j]*2){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        //TC: O(n*log(n))
        return merge(0,nums.length-1,nums);
    }
}
