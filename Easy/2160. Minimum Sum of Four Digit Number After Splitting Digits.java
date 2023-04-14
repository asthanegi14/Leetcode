class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int n = num, i=3;
        while(n>=1){
            arr[i--] = n%10;
            n = n/10;
        }
        Arrays.sort(arr);
        String s1 = "";
        String s2 = "";
        i=0;
        for(i=0;i<4;i++){
            if(i%2==0){
                s1+=arr[i];
            }
            else{
                s2+=arr[i];
            }
        }
        int ans = Integer.valueOf(s1)+Integer.valueOf(s2);
        return ans;
    }
}
