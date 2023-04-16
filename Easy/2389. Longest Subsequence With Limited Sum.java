class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;

        int[] ans = new int[m];
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }

        for(int i=0;i<m;i++){
            ans[i] = search(nums, 0, 0, n, queries[i]);
        }
        return ans;
    }
    public int search(int[] nums, int count, int i, int j, int tar){
        while(i<j){
            int mid = i+(j-i)/2;
            if(nums[mid]<=tar){
                count++;
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i;
    }
}
