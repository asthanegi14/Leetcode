class Solution {
    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(dq.isEmpty() || a[i]>0){
                dq.push(a[i]);
            }
            else{
                while(!dq.isEmpty() && dq.peek()>0 && dq.peek()<Math.abs(a[i])){
                    dq.pop();
                }

                if(!dq.isEmpty() && dq.peek()==Math.abs(a[i])){
                    dq.pop();
                }
                else{
                    if(dq.isEmpty() || dq.peek()<0){
                        dq.push(a[i]);
                    }
                }
            }
        }

        int[] ans = new int[dq.size()];
        int s = dq.size();
        while(!dq.isEmpty()){
            s--;
            ans[s] = dq.pop();
        }
        return ans;
    }
}
