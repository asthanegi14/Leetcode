class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i=0;
        
        while(i<intervals.length){
            if(intervals[i][0]<ni[0]){
                ans.add(intervals[i]);
                i++;
            }
            else{
                break;
            }
        }
        
        if(ans.size()==0 || (ni[0]>ans.get(ans.size()-1)[1])){
            ans.add(ni);
        }
        else{
            int[] a = ans.get(ans.size()-1);
            a[1] = Math.max(a[1], ni[1]);

        }
        
        while(i<intervals.length){
            int[] a = ans.get(ans.size()-1);
            
            if(a[1]>=intervals[i][0]){
                a[1] = Math.max(a[1], intervals[i][1]);    
            }
            else{
                ans.add(intervals[i]);
            }
            
            i++;
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}