class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // ArrayList<ArrayList<Long>> sub = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         // ArrayList<Long> subarr = new ArrayList<>();
        //         int s =0,count=0;
        //         for(int k=i;k<=j;k++){
        //             // subarr.add((long)(nums[k]));
        //             count++;
        //             // System.out.println(count);
        //             s+=(long)nums[k];
        //             // System.out.println("sum = "+s);
        //         }
        //         // if(subarr.size()>1){
        //         //     sub.add(subarr);
        //         // }
        //         if(count>1 && nums.length>1  && s%x==0){
        //             return true;
        //         }
        //     }
        // }
        // ArrayList<Long> sum = new ArrayList<>();
        // for(int i=0;i<sub.size();i++){
        //     int s = 0;
        //     for(int j=0;j<sub.get(i).size();j++){
        //         s+=(long)sub.get(i).get(j);
        //     }
        //     if(s%x==0 || s==0){
        //         return true;
        //     }
        //     // sum.add((long)s);
        // }
        // for(int i=0;i<sum.size();i++){
        //     if(sum.get(i)%x==0){
        //         return true;
        //     }
        // }
        nums[0]=nums[0]%k;
        for(int i=1;i<nums.length;i++){
            nums[i]=(nums[i-1]+nums[i]%k)%k;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                return true;
            }
            if(map.containsKey((nums[i]-k+k)%k)){
                if(i-map.get((nums[i]-k+k)%k) >1){
                    return true;
                }
            }
            else{
                map.put(nums[i],i);
            }
        }

        return false;
    }
}
