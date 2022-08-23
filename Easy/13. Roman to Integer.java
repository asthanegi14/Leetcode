class Solution {
    public int value(char a){
        if(a == 'I'){return 1;}
        if(a == 'V'){return 5;}
        if(a == 'X'){return 10;}
        if(a == 'L'){return 50;}
        if(a == 'C'){return 100;}
        if(a == 'D'){return 500;}
        if(a == 'M'){return 1000;}
        return 0;
    }
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i=1;i<c.length;i++){
            int a = value(c[i-1]);
            int b = value(c[i]);
            if(a>=b){
                sum += a;
            }
            else{
                sum -= a;
            }
        }
        sum += value(c[c.length-1]);
        return sum;
    }
}
