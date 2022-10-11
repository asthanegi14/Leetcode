class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,n=arr.length-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(arr[mid]-(mid+1)<k){
                i=mid+1;
            }
            else{
                n=mid-1;
            }
        }
        return k+i;
    }
}
