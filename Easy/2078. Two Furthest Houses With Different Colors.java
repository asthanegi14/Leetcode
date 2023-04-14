class Solution {
    public int maxDistance(int[] colors) {
        int i=0, j=colors.length-1, n=colors.length;
        while(colors[0]==colors[j]){
            j--;
        }
        while(colors[i]==colors[n-1]){
            i++;
        }

        return Math.max(j, n-i-1);
    }
}
