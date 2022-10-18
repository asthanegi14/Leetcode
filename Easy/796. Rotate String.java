class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()){
            return false;
        }
        // for(int i=0;i<g.length();i++){
        //     for(int j=0;j<s.length();j++){
        //         if(g.charAt(i)==s.charAt(j)){
        //              if(s.substring(j,s.length()).equals(g.substring(i,g.length())) && s.substring(0,j).equals(g.substring(g.length()-j,g.length()))){
        //                  return true;
        //              }
        //         }
        //     }
        // }
        // return false;
        String c = s+s;

        System.out.println(c);
        if(c.contains(g)){
            return true;
        } 
        return false;
    }
}
