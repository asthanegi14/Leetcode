class Solution {
    public boolean find(char[][] a, String w, int i, int j, int k){
        if(k==w.length()){
            return true;
        }
        if(i<0 || i>=a.length || j<0 || j>=a[i].length){
            return false;
        }
        if(a[i][j]!=w.charAt(k)){
            return false;
        }
        a[i][j] ^= 256;
        boolean isValid = find(a, w, i+1, j, k+1) 
            || find(a, w, i, j+1, k+1)
            || find(a, w, i-1, j, k+1)
            || find(a, w, i, j-1, k+1);
        a[i][j] ^= 256;
        
        return isValid;
    }
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(find(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
}