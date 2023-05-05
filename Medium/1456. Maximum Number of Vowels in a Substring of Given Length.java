class Solution {
    public int maxVowels(String s, int k) {
        
        int i=0, j=0;
        long ans=0, res=0;

        // List<String> list = new ArrayList<>();

        // while(j<=s.length()){
        //     list.add(s.substring(i, j));
        //     i++;
        //     j++;
        // }

        // for(String str:list){
        //     ans=0;
        //     for(int m=0;m<str.length();m++){
        //         if(str.charAt(m)=='a' || str.charAt(m)=='e' || str.charAt(m)=='i' || str.charAt(m)=='o' || str.charAt(m)=='u'){
        //             ans++;
        //         }
        //     }
        //     res = Math.max(ans, res);
        // }

        // return res;


        while(j!=k){
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                ans++;
            }
            j++;
        }
        // System.out.println("i="+i+" j="+j+" ans="+ans);
        while(j<s.length()){
            res=Math.max(ans, res);
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                ans--;
            }
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                ans++;
            }
            i++;
            j++;
            res=Math.max(ans, res);
        // System.out.println("i="+i+" j="+j+" ans="+ans+" res="+res);
        }
        
        res=Math.max(ans, res);
        return (int)res;
    }
}
