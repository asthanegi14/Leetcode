class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int ans=0;
        for(Integer en: map.values()){
            if(en==1){
                return -1;
            }
            int count=0;
            while(en>3){
                count++;
                en-=3;
            }
            if(en>=0){
                count++;
            }
            ans+=count;
        }
        return ans;
    }
}
