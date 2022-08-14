class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                StringBuilder mul = new StringBuilder();
                while(c != '['){
                    mul.append(c);
                    c = s.charAt(++i);
                }
                int l = Integer.parseInt(mul.toString());
                int op = 1;
                c = s.charAt(++i);
                StringBuilder x = new StringBuilder();
                while(op>0){
                    x.append(c);
                    c = s.charAt(++i);
                    if(c == '['){op++;}
                    if(c==']'){op--;}
                }
                
                String y = decodeString(x.toString());
                while(l>0){
                    res.append(y);
                    l--;
                }
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
