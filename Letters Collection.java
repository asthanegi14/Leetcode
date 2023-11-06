class Solution{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        // code here
        List<Integer> ans = new ArrayList<>();
        int sum=0;
        
        for(int i=0;i<q;i++){
            if(queries[i][0]==1){
                int x = queries[i][1], y = queries[i][2];
                sum=0;
                if(x-1>=0 && y-1>=0){
                    sum+=mat[x-1][y-1];
                }
                if(x-1>=0){
                    sum+=mat[x-1][y];
                }
                if(x-1>=0 && y+1<m){
                    sum+=mat[x-1][y+1];
                }
                if(y-1>=0){
                    sum+=mat[x][y-1];
                }
                if(y+1<m){
                    sum+=mat[x][y+1];
                }
                if(x+1<n && y-1>=0){
                    sum+=mat[x+1][y-1];
                }
                if(x+1<n){
                    sum+=mat[x+1][y];
                }
                if(x+1<n && y+1<m){
                    sum+=mat[x+1][y+1];
                }
            }
            else if(queries[i][0]==2){
                int x = queries[i][1], y = queries[i][2];
                sum=0;
                if(x-2>=0 && y-2>=0){
                    sum+=mat[x-2][y-2];
                }
                if(x-2>=0 && y-1>=0){
                    sum+=mat[x-2][y-1];
                }
                if(x-2>=0){
                    sum+=mat[x-2][y];
                }
                if(x-2>=0 && y+1<m){
                    sum+=mat[x-2][y+1];
                }
                if(x-2>=0 && y+2<m){
                    sum+=mat[x-2][y+2];
                }
                if(x-1>=0 && y-2>=0){
                    sum+=mat[x-1][y-2];
                }
                if(x-1>=0 && y+2<m){
                    sum+=mat[x-1][y+2];
                }
                if(y-2>=0){
                    sum+=mat[x][y-2];
                }
                if(y+2<m){
                    sum+=mat[x][y+2];
                }
                if(x+1<n && y-2>=0){
                    sum+=mat[x+1][y-2];
                }
                if(x+1<n && y+2<m){
                    sum+=mat[x+1][y+2];
                }
                if(x+2<n && y-2>=0){
                    sum+=mat[x+2][y-2];
                }
                if(x+2<n && y-1>=0){
                    sum+=mat[x+2][y-1];
                }
                if(x+2<n){
                    sum+=mat[x+2][y];
                }
                if(x+2<n && y+1<m){
                    sum+=mat[x+2][y+1];
                }
                if(x+2<n && y+2<m){
                    sum+=mat[x+2][y+2];
                }
            }
            ans.add(sum);
        }
        return ans;
    }
}
