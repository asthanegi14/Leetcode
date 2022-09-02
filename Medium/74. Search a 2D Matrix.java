class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
        
        
        //binary search
//         int i=0,j=matrix[0].length-1;
//         while(i<matrix.length && j>=0){
//             if(matrix[i][j]==target){
//                 return true;
//             }
//             if(matrix[i][j]<target){
//                 i++;
//             }
//             else{
//                 j--;
//             }
//         }
//         return false;
    }
}
