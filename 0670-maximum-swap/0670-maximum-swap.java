class Solution {
    public int maximumSwap(int num) {
        char[] d = Integer.toString(num).toCharArray();
        
        int[] n = new int[10];
        Arrays.fill(n, Integer.MIN_VALUE);
        
        for(int i=0;i<d.length;i++){
            n[d[i]-'0'] = i;
        }
        
        for(int i=0;i<d.length;i++){
            for(int j=9;j>d[i]-'0';j--){
                if(n[j]>i){
                    char temp = d[i];
                    d[i] = d[n[j]];
                    d[n[j]] = temp;
                    
                    return Integer.valueOf(new String(d));
                }
            }
        }
        
        return num;
    }
}