class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Tc: O(n*n*n)
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        // int i=0,j=0,k=0;
        // for(i=0;i<nums.length-2;i++){
        //     for(j=i+1;j<nums.length-1;j++){
        //         for(k=j+1;k<nums.length;k++){
        //             List<Integer> addIt = new ArrayList<>();
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 addIt.add(nums[i]);
        //                 addIt.add(nums[j]);
        //                 addIt.add(nums[k]);
        //             }
        //             if(addIt.size()!=0){
        //                 ans.add(addIt);
        //             }
        //         }
        //     }
        // }
        // return ans;
        
        //TC:O(n*n)
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int lo=i+1, hi=nums.length-1, sum=0-nums[i];
                
                while(lo<hi){
                    if(nums[lo]+nums[hi]==sum){
                        List<Integer> addIt = new ArrayList<>();
                        addIt.add(nums[i]);
                        addIt.add(nums[lo]);
                        addIt.add(nums[hi]);
                        ans.add(addIt);
                        while(lo<hi && nums[lo]==nums[lo+1]){lo++;}
                        while(lo<hi && nums[hi]==nums[hi-1]){hi--;}
                        lo++;hi--;
                    }
                    else if(nums[lo]+nums[hi]<sum){lo++;}
                    else{hi--;}
                }
            }
        }
        return ans;
    }
}
