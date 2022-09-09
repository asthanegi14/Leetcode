class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer> ans=new ArrayList<>();
        // Map<Integer,Integer> map= new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer, Integer> a: map.entrySet()){
        //     if(a.getValue()>(nums.length/3)){
        //         ans.add(a.getKey());
        //     }
        // }
        // return ans;
        
        List<Integer> ans=new ArrayList<>();
        int num1=Integer.MIN_VALUE,num2=Integer.MIN_VALUE,c1=0,c2=0;
        
        for(int i:nums){
            if(i==num1){
                c1++;
            }
            else if(i==num2){
                c2++;
            }
            else if(c1==0){
                num1=i;
                c1=1;
            }
            else if(c2==0){
                num2=i;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        int count1=0, count2=0;
        for(int i:nums){
            if(i==num1){
                count1++;
            }
            if(i==num2){
                count2++;
            }
        }
        if(count1>nums.length/3){
        ans.add(num1);
        }
        if(count2>nums.length/3){
            ans.add(num2);
        }
        
        return ans;
    }
}
