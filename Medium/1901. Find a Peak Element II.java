class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int i=0,j=mat.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int maxOfRow = findMaxRow(mat[mid],mat[mid].length-1);
            
            // System.out.println("mid="+mid+" max="+maxOfRow);
            
            if(mid==0){
                if(mat[mid][maxOfRow]>mat[mid+1][maxOfRow]){
                    return new int[]{mid,maxOfRow};
                }    
            }
            
            if(mid==mat.length-1){
                if(mat[mid][maxOfRow]>mat[mid-1][maxOfRow]){
                    return new int[]{mid,maxOfRow};
                }
            }
            
            if(mat[mid][maxOfRow]>mat[mid+1][maxOfRow] && mat[mid][maxOfRow] > mat[mid-1][maxOfRow]){
                return new int[]{mid,maxOfRow};
            }
            if(mat[mid][maxOfRow]<mat[mid+1][maxOfRow]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    
    //to find maximum from passing rows
    public int findMaxRow(int[] a, int len){
        int max=0;
        for(int i=0;i<=len;i++){
            // System.out.println("a["+i+"]="+a[i]);
            if(a[i]>a[max]){
                max=i;
            }
            // System.out.println("maxOfRow="+max);
        }
        return max;
    }
}
