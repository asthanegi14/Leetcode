class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int[] ans = new int[nums.length];
        ArrayList<Integer> pos = new ArrayList<>();        
        ArrayList<Integer> neg = new ArrayList<>();

        int i=0, k=0, n=nums.length;
        
        while(i<n){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{                
                pos.add(nums[i]);
            }
            i++;
        }
        i=0;
        int j=0;
        
        while(i<pos.size() && j<neg.size()){
            ans[k++] = pos.get(i++);
            ans[k++] = neg.get(j++);
        }
        return ans;
    }
}