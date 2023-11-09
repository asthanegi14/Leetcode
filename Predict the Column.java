class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int ans=-1, max=0;
        
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j][i]==0){
                    count++;
                }
            }
            // System.out.println("max="+max+" count="+count);
            if(count>max){
                max = count;
                ans = i;
                // System.out.println("ans = "+ans);
            }
        }
        return ans;
    }
}
