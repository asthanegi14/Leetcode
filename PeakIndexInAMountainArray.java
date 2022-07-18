class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int n=arr.length-1;
        while(i<=n)
        {
            int mid=i+(n-i)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
                n=mid;
            else
                i=mid+1;
        }
        return -1;
    }
}
