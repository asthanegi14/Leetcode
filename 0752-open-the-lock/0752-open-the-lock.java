class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> set = new HashSet<>(Arrays.asList(deadends));
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();
        
        if(set.contains("0000")){
            return -1;
        }
        q.add(new Pair<>("0000", 0));
        vis.add("0000");
        
        while(!q.isEmpty()){
            Pair<String, Integer> pop = q.poll();
            String curr = pop.getKey();
            int ans = pop.getValue();
            
            if(curr.equals(target)){
                return ans;
            }
            
            for(int i=0;i<4;i++){
                int[] move = {-1, 1};
                
                for(int j:move){
                    int newDig = ((curr.charAt(i)-'0')+j+10)%10;
                    String newStr = curr.substring(0, i) + newDig + curr.substring(i+1);
                    
                    if(!vis.contains(newStr) && !set.contains(newStr)){
                        q.add(new Pair<>(newStr, ans+1));
                        vis.add(newStr);
                    }
                }
            }
        }
        
        return -1;
    }
}