class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        int max = num;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='6'){
                str = str.substring(0,i)+'9'+str.substring(i+1);
                max = Integer.max(Integer.parseInt(str),max);
                str = str.substring(0,i)+'6'+str.substring(i+1);
            }
            else if(str.charAt(i)=='9'){
                str = str.substring(0,i)+'6'+str.substring(i+1);
                max = Integer.max(Integer.parseInt(str),max);
                str = str.substring(0,i)+'9'+str.substring(i+1);
            }
        }
        return max;
    }
}
