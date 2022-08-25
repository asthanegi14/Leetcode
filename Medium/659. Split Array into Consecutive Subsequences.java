class Solution {
    public boolean isPossible(int[] nums) {
        
        if(nums.length<3) return false;
        Map<Integer,Integer> a = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        // System.out.print("a = "+a);
        
        PriorityQueue<Integer> b = new PriorityQueue<>();
        for(int i: a.keySet()){
            b.add(i);
        }
        
        while(!b.isEmpty()){
            int min = b.peek(); 
            System.out.print("min = "+min);
            int count=0;
            while(true){
                if(!a.containsKey(min)){
                    if(count<3) return false;
                    break;
                }
                a.put(min,a.get(min)-1);
                count++;
                if(a.get(min)==0){
                    if(min != b.peek()) return false;
                    b.poll();
                }
                if(a.containsKey(min+1) && a.get(min)+1>a.get(min+1)){
                    if(count<3){return false;}
                    break;
                }
                min+=1;
            }
        }
        return true;
    }
}
