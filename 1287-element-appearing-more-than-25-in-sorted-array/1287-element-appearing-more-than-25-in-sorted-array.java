class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length, count=0;
        
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/4){
                return arr[i];
            }
        }
        
        return -1;
    }
}