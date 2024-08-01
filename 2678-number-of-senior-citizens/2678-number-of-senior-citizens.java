class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(String s:details){
            int age = Integer.parseInt(s.substring(11, s.length()-2));
            if(age>60){
                count++;
            }
        }
        
        return count;
    }
}