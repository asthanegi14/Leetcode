class Solution {
    public void rev(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public String smallestNumber(String pattern) {
        int[] arr = new int[pattern.length()+1];

        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        int i=0,a=0, b=0;

        while(i<pattern.length()){
            char c = pattern.charAt(i);
            if(c=='I'){
                a=i;
            }
            else if(c=='D'){
                int j=i;a
                while(j<pattern.length() && pattern.charAt(j)=='D'){
                    j++;
                }
                rev(arr, i, j);
                i=j-1;
            }
            i++;
        }
        String ans = "";
        for(int m=0;m<arr.length;m++){
            ans+=String.valueOf(arr[m]);
        }
        return ans;
    }
}
