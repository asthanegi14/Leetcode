class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        int ini=nums[0], i=0, j=i+1;
        int last=ini;

        while(i<nums.length && j<nums.length){
            while(j<nums.length && nums[j]-nums[j-1]==1){
                j++;
            }
            String s = "";
            if(j-1<nums.length){
                if(i==j-1){
                    s+=nums[i];
                }
                else{
                    s+=nums[i]+"->"+nums[j-1];
                }
            }
            ans.add(s);
            i=j;
            j++;
        }
        if(i<nums.length){
            ans.add(String.valueOf(nums[i]));
        }
        return ans;
    }
}
