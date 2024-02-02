class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num = "123456789";
        List<Integer> ans = new ArrayList<>();
        int a = String.valueOf(low).length();
        int b = String.valueOf(high).length();
        
        for(int i=a;i<=b;i++){
            for(int j=0;j<10-i;j++){
                int n = Integer.parseInt(num.substring(j, j+i));
                if(n>=low && n<=high){
                    ans.add(n);
                }
            }
        }
        return ans;
    }
}