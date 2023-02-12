class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int l=0, r=matrix[0].length-1, top=0, bot=matrix.length-1;

        while(l<=r && top<=bot){
            for(int i=l;i<=r;i++){
                ans.add(matrix[l][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                ans.add(matrix[i][r]);
            }
            r--;

            if(top<=bot){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[bot][i]);
                }
                bot--;
            }
            if(l<=r){
                for(int i=bot;i>=top;i--){
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}
