class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int i=0, n=people.length-1, sum=0, count=0;
        
        while(i<=n){
            sum=people[i]+people[n];
            if(sum<=limit){
                count++;
                i++; n--;
            }
            else{
                n--;
                count++;
            }
        }
        
        return count;
    }
}