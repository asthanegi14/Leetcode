class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        String s = String.valueOf(num);

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            int n = c-'0';
            if(n%2==0){
                even.add(n);
            }
            else{
                odd.add(n);
            }
        }
        Collections.sort(even);
        Collections.reverse(even);
        Collections.sort(odd);
        Collections.reverse(odd);

        int e=0, o=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);

            if(Integer.valueOf(c)%2==0){
                ans=10*ans+even.get(e);
                e++;
            }
            else{
                ans=10*ans+odd.get(o);
                o++;
            }
        }
        return ans;
    }
}
