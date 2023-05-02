class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr =  new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        
        int count=0;
        while(arr.size()!=1){
            count = (count+k-1)%arr.size();
            arr.remove(count);
        }
        return arr.get(0);
    }
}
