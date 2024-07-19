class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            int minR = Integer.MAX_VALUE, maxC = Integer.MIN_VALUE;
            int minIdx=-1, maxIdx=-1;
            
            for(int j=0;j<matrix[i].length;j++){
                if(minR>matrix[i][j]){
                    minR = matrix[i][j];
                    minIdx = j;
                }
            }
            
            for(int j=0;j<matrix.length;j++){
                maxC = Math.max(maxC, matrix[j][minIdx]);    
            }
            
            if(minR == maxC){
                ans.add(minR);
            }
        }
        
        return ans;
    }
}