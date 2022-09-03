class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }
        }  
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                b++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                c++;
            }
        }
        int i=0;
        for(i=0;i<a;i++){
            nums[i]=0;
        }
        for(;i<a+b;i++){
            nums[i]=1;
        }
        for(;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
