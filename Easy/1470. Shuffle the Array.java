class Solution {
    public int[] shuffle(int[] nums, int n) {
        // ArrayList<Integer> a1 = new ArrayList<>();
        // ArrayList<Integer> a2 = new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     a1.add(nums[i]);
        // }
        // for(int i=n;i<nums.length;i++){
        //     a2.add(nums[i]);
        // }

        // int[] ans = new int[nums.length];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     ans[j++] = a1.get(i);
        //     ans[j++] = a2.get(i); 
        // }

        // return ans;


        //Optimized
        
        int[] ans = new int[nums.length];
        int i=0, j=n,k=0;
        while(i<n && j<2*n){
            ans[k++] = nums[i];
            ans[k++] = nums[j];
            i++;
            j++;
        }
        return ans;
    }
}
