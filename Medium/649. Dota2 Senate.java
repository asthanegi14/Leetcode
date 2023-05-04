class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=0;i<senate.length();i++){
            char c = senate.charAt(i);
            if(c=='R'){
                q1.add(i);
            }
            else{
                q2.add(i);
            }
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            int a=q1.poll();
            int b=q2.poll();

            if(a<b){
                q1.add(a+senate.length());
            }
            if(b<a){
                q2.add(b+senate.length());
            }
        }
        return q1.size()>q2.size()?"Radiant":"Dire";
    }
}
