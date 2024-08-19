class Solution {    
    int ans = 0;
    public int find(int i, int o, int t){
        if(i==ans){
            return 0;
        }
        
        if(i>ans){
            return 1001; 
        }
        
        if(o==0){
            return 1+find(i, 1, i);
        }
        
        int one = 1+find(i+t, 1, t);
        int two = 1+find(i+t, 0, 0);
        
        return Math.min(one, two);
    }
    public int minSteps(int n) {
        ans=n;
        return find(1, 0, 0);
    }
}