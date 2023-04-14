class Solution {
    public int convertTime(String current, String correct) {
        String[] s1 = current.split(":");
        String[] s2 = correct.split(":");

        int n1 = Integer.valueOf(s1[0])*60+Integer.valueOf(s1[1]);
        int n2 = Integer.valueOf(s2[0])*60+Integer.valueOf(s2[1]);
        int ans=0;

        int diff = n2-n1;
        
        while(diff>=60){
            ans++;
            diff -= 60;
        }
        while(diff>=15){
            ans++;
            diff -= 15;
        }
        while(diff>=5){
            ans++;
            diff -= 5;
        }
        while(diff>=1){
            ans++;
            diff -= 1;
        }
        return ans;
    }
}
