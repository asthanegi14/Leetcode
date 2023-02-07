class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1){
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0, i = 0, n = fruits.length, count=0, ans = 0;
        while(i<n && j<n){
                if(!map.containsKey(fruits[j]) && map.size()!=2){
                    map.put(fruits[j],1);
                    count++;
                    j++;
                    ans = Math.max(ans,count);
                }
                else if(map.containsKey(fruits[j])){
                    count++; 
                    ans = Math.max(ans,count);
                    j++;
                }
                else{
                    ans = Math.max(ans,count);
                    if((n-j)<ans){
                        return ans;
                    }
                    i++;
                    j=i;
                    count = 0;
                    map.clear();
                }
        }
        return ans;
    }
}
