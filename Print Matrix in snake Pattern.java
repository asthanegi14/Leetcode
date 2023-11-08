
class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int mat[][])
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, n=mat.length;
        
        while(i<n){
            int j=0;
            while(j<n){
                ans.add(mat[i][j]);
                j++;
            }
            i++; j=n-1;
            
            while(j>=0 && i<n){
                ans.add(mat[i][j]);
                j--;
            }
            i++;
        }
        return ans;
    }
}
