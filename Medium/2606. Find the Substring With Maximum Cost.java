class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<26;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<chars.length();i++){
            char c = chars.charAt(i);
            arr[c-'a'] = vals[i];
        }
        
        int max = Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<s.length();i++){
            sum += arr[s.charAt(i)-'a'];
            max = Math.max(sum, max);
            if(sum<0){
                sum=0;
            }
        }
        
        return max<=0 ? 0:max;
    }
}
