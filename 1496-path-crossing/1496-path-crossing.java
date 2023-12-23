class Solution {
    public boolean isPathCrossing(String path) {
        List<int[]> l = new ArrayList<>();
        int x=0, y=0;
        int[] arr = new int[2];
        l.add(arr);
        
        for(int i=0;i<path.length();i++){
            char c = path.charAt(i);
            
            if(c=='N'){
                y+=1;
            }
            else if(c=='E'){
                x+=1;
            }
            else if(c=='W'){
                x-=1;
            }
            else{
                y-=1;
            }
            int[] a = new int[]{x, y};
            for(int[] j:l){
                if(j[0]==a[0] && j[1]==a[1]){
                    return true;
                }
            }
            
            l.add(a);
        }
        
        return false;
    }
}