class Solution {
    public int[] twoSum(int[] nums, int target) {
        //TC: O(N*N)
        //SC: O(1)
//         int[] a = new int[2];
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums.length;j++)
//             {
//                 if(nums[i]+nums[j]==target && i!=j)
//                 {
//                     a[0] = i;
//                     a[1] = j;
//                 }
//             }
//         }
//         return a;
        
        
         int[] ans = new int[2];
        //TC: O(n log n)
        //SC: O(1)
        
        
//         int i=0,j=nums.length-1;
//         while(i<nums.length && j>=0){
//             if(nums[i]+nums[j]==target){
//                 ans[0] = i;
//                 ans[1] = j;
//                 break;
//             }   
//             if(nums[i]+nums[j]>target){
//                 j--;
//             }
//             else{
//                 i++;
//             }
//         }
//         return ans;
        
        //TC: O(n log n)
        //SC: O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer num = map.get(target-nums[i]);
            if(num==null){
                map.put(nums[i],i);
            }
            else{
                ans[0]=i;
                ans[1]=num;
            }
        }
        return ans;
    }
}
