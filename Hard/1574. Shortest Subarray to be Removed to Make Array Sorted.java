class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int a = arr.length, b=0;

        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int pre = arr[i-1];

            if(temp < pre){
                a = Math.min(a, i);
                b = Math.max(b, i);
            }
        }

        int ans = Math.min(b, arr.length-a);
        if(ans==0){
            return 0;
        }

        int len = arr.length-b;
        int i=0, j=b;

        while(i<a && j<arr.length){
            int x = arr[i], y=arr[j];

            if(x<=y){
                len++;
                ans = Math.min(ans, arr.length-len);
                i++;
            }
            else{
                len--;
                j++;
            }
        }
        return ans;
    }
}
