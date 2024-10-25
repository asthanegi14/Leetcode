class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        
        Arrays.sort(folder);
        
        for(int i=0;i<folder.length;i++){
            if(ans.size()==0 || !folder[i].startsWith(ans.get(ans.size()-1)+"/")){
                ans.add(folder[i]);
            }
        }
        
        
        return ans;
    }
}