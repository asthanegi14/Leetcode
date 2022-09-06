class Solution {
    public int[] rearrangeArray(int[] nums) {
//         int[] evn = new int[nums.length/2];
//         int[] odd = new int[nums.length/2];
//         int[] ans = new int[nums.length];
        
//         int k=0,j=0;
//         for(int i=0;i<nums.length;i++){
            
//             if(nums[i]>0){
//                 evn[k++]=nums[i];
//             }
//             else{
//                 odd[j++]=nums[i];
//             }
//         }
//         int m=0,n=0;
//         for(int i=0;i<ans.length;){
//             ans[i]=evn[m];
//             i+=2;
//             m++;;
//         }
//         for(int i=1;i<ans.length;){
//             ans[i]=odd[n];
//             i+=2;
//             n++;
//         }
//         return ans;
        
        int[] ans = new int[nums.length];
        int k=0,l=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[k]=nums[i];
                k+=2;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[l]=nums[i];
                l+=2;
            }
        }
        return ans;
    }
}
