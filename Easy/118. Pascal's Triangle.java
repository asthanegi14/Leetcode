class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        List<Integer> a, b=null;
        
        for(int i=0;i<numRows;i++){
            a = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    a.add(1);
                    // System.out.println(ans);
                }
                else{
                    a.add(b.get(j-1)+b.get(j));
                }
            }
            b=a;
            ans.add(a);
        }
        return ans;
    }
}
