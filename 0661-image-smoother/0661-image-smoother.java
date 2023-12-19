class Solution {
    public int find(int[][] a, int i, int j){
        int n = a.length, m=a[0].length;
        int count=0, sum=0;
        
        for(int l=-1;l<=1;l++){
            for(int x=-1;x<=1;x++){
                int nl = i+l;
                int nx = j+x;
                
                if(nl<0 || nl>=n || nx<0 || nx>=m){
                    continue;
                }
                sum+=a[nl][nx];
                count++;
            }
        }
        
        return sum/count;
    }
    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m=img[0].length;
        int[][] ans = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = find(img, i, j); 
            }
        }
        return ans;
    }
}