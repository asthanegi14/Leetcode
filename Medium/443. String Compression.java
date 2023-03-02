class Solution {
    public int compress(char[] chars) {
        String s = "";
        int i=0, j=0, count=0;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                j++;
            }
            else{
                count=j-i;
                s+=chars[i];
                if(count>1){
                    s+=String.valueOf(count);
                }
                i=j;
            }
        }
        if(i<chars.length){
            count=j-i;
            s+=chars[i];
            if(count>1){
                s+=String.valueOf(count);
            }
        }
        for(int k=0;k<s.length();k++){
            chars[k] = s.charAt(k);
        }

        return s.length();
    }
}
