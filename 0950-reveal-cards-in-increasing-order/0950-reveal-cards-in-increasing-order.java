class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[deck.length];
        
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        Arrays.sort(deck);
        
        int i=0;
        while(!q.isEmpty()){
            int top = q.poll();
            ans[top] = deck[i++];
            if(q.size()>0){
                q.add(q.poll());
            }
        }
        
        return ans;
    }
}