class Solution {
    public String maximumTime(String time) {
        char[] ch = time.toCharArray();

        if(ch[0]=='?'){
            ch[0] = (ch[1]<='3' || ch[1]=='?')?'2':'1';
        }
        if(ch[1]=='?'){
            ch[1] = ch[0]=='2'?'3':'9';
        }
        if(ch[3]=='?'){
            ch[3] = '5';
        }
        if(ch[4]=='?'){
            ch[4] = '9';
        }

        return new String(ch);
    }
}
