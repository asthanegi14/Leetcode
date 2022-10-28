class Solution {

    //finding anagram or not
    //111/117
    // public boolean isAnagram(String s1, String s2){
    //     if(s1.length() != s2.length()){
    //         return false;
    //     }
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     HashMap<Character,Integer> map2 = new HashMap<>();
    //     for(int k=0;k<s1.length();k++){
    //         map.put(s1.charAt(k),map.getOrDefault(s1.charAt(k),0)+1);
    //     }
    //     for(int k=0;k<s2.length();k++){
    //         map2.put(s2.charAt(k),map2.getOrDefault(s2.charAt(k),0)+1);
    //     }
    //     return (map.equals(map2));
    // }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        if(strs==null){
            return arr;
        }
        // for(int i=0;i<strs.length;i++){
        //     ArrayList<String> addto = new ArrayList<>();
        //     addto.add(strs[i]);
        //     for(int j=0;j<strs.length;j++){
        //         if(i!=j){
        //             // System.out.println(strs[i]+" "+strs[j]+" is anagram = "+isAnagram(strs[i],strs[j]));
        //             if(isAnagram(strs[i],strs[j])){
        //                 addto.add(strs[j]);
        //             }
        //         }
        //     }
        //     Collections.sort(addto);
        //     arr.add(addto);
        // }
        // System.out.println(arr);


        // //removing duplicate entries from arraylist
        // int n=arr.size();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i!=j && arr.get(i).equals(arr.get(j))){
        //             arr.remove(arr.get(i));
        //             n=n-1;
        //             j=0;
        //             // System.out.println("for i = "+i+" j = "+j);
        //             // System.out.println(arr);
        //         }
        //     }
        // }
        HashMap<String,List<String>> map = new HashMap<>();

        Arrays.sort(strs);
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);

            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
