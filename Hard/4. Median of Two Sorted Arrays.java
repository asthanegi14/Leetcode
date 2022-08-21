class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            ans[k] = nums1[i];
            k++;
        }
        for(int i=0;i<nums2.length;i++){
            ans[k]=nums2[i];
            k++;
        }
        Arrays.sort(ans);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print("ans = "+ans[i]+" ");
        // }
        int mid = ans.length/2;
        // System.out.print("mid= "+ans[mid]+" mid-1= "+ans[mid-1]+" ");
        int len = ans.length % 2;
        // System.out.print("len= "+len+" ");
        double median=0.0;
        if(len ==0){
            int sum = ans[mid] + ans[mid-1];
            // System.out.print("sum= "+sum+" ");
            median =(double)(sum/2.0); 
        }
        else{
            median = (double)(ans[mid]);
        }
        return median;
    }
}
