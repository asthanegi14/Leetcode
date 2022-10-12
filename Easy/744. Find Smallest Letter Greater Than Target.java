class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);

        int i=0,n=letters.length-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(letters[mid]<=target){
                i=mid+1;
            }
            else{
                n=mid-1;
            }
        }
        if(i<letters.length){
            return letters[i];
        }
        else{
            return letters[0];
        }
    }
}
