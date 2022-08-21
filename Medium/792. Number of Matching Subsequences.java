class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        // it will give TLE for long string like:  s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbb", words=["ab"] 
        // int ans = 0;
        // for(int i=0;i<words.length;i++)
        // {
        //     int y=0;
        //     String t = words[i];
        //     for(int j=0;j<s.length();j++)
        //     {
        //         if(t.charAt(y) == s.charAt(j))
        //         {
        //             y++;
        //         }
        //         if(y==t.length()){
        //             ans+=1;
        //             break;
        //         }
        //     }
        // }
        // return ans;
        
        
        //so we will solve this by using hashmap 
        HashMap<String, Integer> n = new HashMap<>();
        for(String i: words){
            Integer x = n.getOrDefault(i,0);
            n.put(i,x+1);
        }
        int ans=0;
        char c[] = s.toCharArray();
        for(String str : n.keySet()){
            char w[] = str.toCharArray();
            int i=0,j=0;
            while(i<c.length && j<w.length)
            {
                if(c[i]==w[j])
                {
                    i++;j++;
                }
                else{
                    i++;
                }
            }
            if(j==w.length)
            {
                ans += n.get(str);
            }
        }
        return ans;
    }
}
