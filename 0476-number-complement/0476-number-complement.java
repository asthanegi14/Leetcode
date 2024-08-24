class Solution {
    public int findComplement(int num) {
        StringBuffer sb = new StringBuffer();
        
        while(num>0){
            int bit = num&1;
            if(bit==1){
                sb.insert(0, 0);
            }
            else{
                sb.insert(0, 1);
            }
            
            num>>=1;
        }
        
        return Integer.parseInt(sb.toString(), 2);
    }
}