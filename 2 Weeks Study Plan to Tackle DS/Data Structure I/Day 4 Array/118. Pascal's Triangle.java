class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> addIt, addIt2 = null;

        for(int i=0;i<numRows;i++){
            addIt = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    addIt.add(1);
                }
                else{
                    addIt.add(addIt2.get(j-1)+addIt2.get(j));
                }
            }
            addIt2 = addIt;
            ans.add(addIt);
        }
        return ans;
    }
}
