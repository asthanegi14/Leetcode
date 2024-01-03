class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0, pre=0;
        int n=bank.length;
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count>0){
                ans += pre*count;
                pre = count;
            }
            a[i] = count;
        }
        return ans;
    }
}