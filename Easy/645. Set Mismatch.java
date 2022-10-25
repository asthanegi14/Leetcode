class Solution {
    // public int finddup(int[] nums){
    //     int i=1,n=nums.length-1;
    //     for(int k=0;k<=n;k++){
    //         System.out.print(nums[k]+" ");
    //     }
    //     System.out.println();
    //     while(i<n){
    //         int mid = i+(n-i)/2;
    //         int count=0;
    //         System.out.println(mid+" i = "+i+" n = "+n);
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j]<=mid){
    //                 count++;
    //             }
    //         }
    //         if(count<=mid){
    //             i=mid+1;
    //         }
    //         else{
    //             n=mid;
    //         }
    //     }
    //     return i;
    // }
    public boolean findpre(int[] nums, int key){
        int i=0,n=nums.length;
        while(i<n){
            int mid = i+(n-i)/2;

            if(nums[mid]==key){
                return true;
            }
            else if(nums[mid]<key){
                i=mid+1;
            }
            else{
                n=mid;
            }
        }
        return false;
    }
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int[] ans = new int[2];
        // ans[0] = finddup(nums);
        
        // int n2=1;
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]!=n2){
        //         ans[1]=n2;
        //     }
        //     n2++;
        // }
        // return ans;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    ans[0]=nums[i];
                    break;
                }
            }
        }
        boolean pre=false;
        int  i=1;
        while(i<=nums.length){
            pre = findpre(nums,i);
            // System.out.println(i+ " is = "+pre);
            if(pre==false){
                ans[1]=i;
                break;
            }
            i++;
        }
        return ans;
    }
}
