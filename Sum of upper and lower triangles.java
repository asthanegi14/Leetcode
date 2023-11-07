class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int mat[][], int n)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int s1=0, s2=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                s1+=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s2+=mat[i][j];
                if(i==j){
                    break;
                }
            }
        }
        ans.add(s1);
        ans.add(s2);
        return ans;
    }
}
