class Solution {
    public boolean isLeapYear(int y){
        if((y%4==0 && y%100!=0) || y%400==0){
            return true;
        }
        return false;
    }
    public int dayOfYear(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] s = date.split("-");
        int year = Integer.valueOf(s[0]);
        int mon = Integer.valueOf(s[1]);
        int day = Integer.valueOf(s[2]);
        int ans = 0;
        boolean leap = isLeapYear(year);
        

        for(int i=0;i<mon-1;i++){
            if(leap && i==1){
                ans+=days[i]+1;
                continue;
            }
            ans+=days[i];
        }
        return ans+day;
    }
}
