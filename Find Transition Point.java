class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        
        int ans=-1, i=0, j=n-1;
        
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==1){
                ans = mid;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
}
