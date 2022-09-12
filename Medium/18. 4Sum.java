class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-3;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                for(int j=i+1;j<nums.length;j++){
                    if(j==i+1 || (j>i+1 && nums[j]!=nums[j-1])){
                        int lo=j+1,hi=nums.length-1;

                        long add = nums[i]+nums[j];
                        long val = ((long)target - add);

                        while(lo<hi){
                            int sum = nums[lo]+nums[hi];

                            if(sum<val){lo++;}
                            else if(sum>val){hi--;}
                            else{
                                List<Integer> addIt = new ArrayList<>();

                                addIt.add(nums[i]);
                                addIt.add(nums[j]);
                                addIt.add(nums[lo]);
                                addIt.add(nums[hi]);

                                ans.add(addIt);

                                while(lo<hi && nums[lo]==nums[lo+1]){lo++;}

                                while(lo<hi && nums[hi]==nums[hi-1]){hi--;}
                                lo++;
                                hi--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
