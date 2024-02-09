class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n=nums.length;
        int[] a = new int[n];
        int[] b = new int[n];
        
        Arrays.sort(nums);
        int max=0, i=-1;
        
        for(int j=0;j<n;j++){
            a[j] = 1;
            b[j] = -1;
            
            for(int k=j-1;k>=0;k--){
                if(nums[j]%nums[k]==0){
                    if(1+a[k]>a[j]){
                        a[j] = 1+a[k];
                        b[j] = k;
                    }
                }
            }
            
            if(a[j]>max){
                max = a[j];
                i=j;
            }
        }
        while(i!=-1){
            ans.add(nums[i]);
            i = b[i];
        }
        return ans;
    }
}