class Solution {
    public void combine(int[] nums, int i, int n, int mid){
        int s = mid-i+1, s2 = n-mid;
        
        int[] l = new int[s];
        int[] r = new int[s2];
        
        for(int k=0;k<s;k++){
            l[k] = nums[i+k];
        }
        
        for(int k=0;k<s2;k++){
            r[k] = nums[mid+1+k];
        }
        
        int k=0, m=0, x=i;
        
        while(k<s && m<s2){
            if(l[k]<r[m]){
                nums[x++] = l[k];
                k++;
            }
            else{
                nums[x++] = r[m];
                m++;
            }
        }
        
        while(k<s){
            nums[x++] = l[k];
            k++;
        }
        while(m<s2){
            nums[x++] = r[m];
            m++;
        }
    }
    public void merge(int i, int[] nums, int n){
        if(i<n){
            int mid = i+(n-i)/2;
            merge(i, nums, mid);
            merge(mid+1, nums, n);
            combine(nums, i, n, mid);
        }
    }
    public int[] sortArray(int[] nums) {
        merge(0, nums, nums.length-1);
        
        return nums;
    }
}