class Solution {
    public int search(int[] a){
        int i=0, j=a.length-1;

        while(i<=j){
            int mid = i+(j-i)/2;

            if(a[mid]<0){
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
    public int countNegatives(int[][] grid) {
        int count=0;

        for(int[] a: grid){
            count += a.length - search(a);
        }
        return count;
    }
}
