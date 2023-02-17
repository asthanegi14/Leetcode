class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        
        for(int i=1;i<arr.length;i++){
            diff = Math.min(diff,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
            ArrayList<Integer> a = new ArrayList();
            if(arr[i]-arr[i-1]==diff){
                a.add(arr[i-1]);
                a.add(arr[i]);
            }
            if(!a.isEmpty()){
                ans.add(a);
            }
        }
        return ans;
    }
}
