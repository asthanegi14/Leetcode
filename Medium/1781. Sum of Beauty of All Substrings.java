class Solution {
    public int findBeauty(int[] c){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(c[i]==0){continue;}
            max = Math.max(max,c[i]); 
            min = Math.min(min,c[i]); 
        }
        // System.out.println(max-min);
        return max-min;
    }
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] c = new int[26];
            for(int j=i;j<s.length();j++){
                c[s.charAt(j)-'a']++;
                sum+=findBeauty(c);
            }
        }
        return sum;
    }
}
