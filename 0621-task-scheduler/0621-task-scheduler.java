class Solution {
    public int leastInterval(char[] tasks, int n) {
        int max=0, count=0;
        HashMap<Character, Integer> map = new HashMap<>();
            
        for(char i:tasks){
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i)==max){
                count++;
            }
            else if(map.get(i)>max){
                max = map.get(i);
                count=1;
            }
        }
        
        return Math.max(tasks.length, ((max-1)*(n+1))+count);
    }
}