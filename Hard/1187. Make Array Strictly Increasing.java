class Solution {
    public int search(int[]a, int t){
        int l=0, r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(a[mid]<=t){
                l=mid+1;
            } 
            else{
                r=mid-1;
            }
        }
        return l;
    }
    HashMap<Pair<Integer, Integer>, Integer> map = new HashMap<>();
    public int find(int i, int pre, int[] a, int[] b){
        if(i==a.length){
            return 0;
        }

        if(map.containsKey(new Pair<>(i, pre))){
            return map.get(new Pair<>(i, pre));
        }

        int x = Integer.MAX_VALUE-100;

        if(a[i]>pre){
            x = find(i+1, a[i], a, b);
        }
        int idx = search(b, pre);

        if(idx<b.length){
            x = Math.min(x, 1+find(i+1, b[idx], a, b));
        }

        map.put(new Pair<>(i, pre), x);

        return x;
    }
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        int ans = find(0, -1, arr1, arr2);

        return ans<Integer.MAX_VALUE-100?ans:-1;
    }
}
