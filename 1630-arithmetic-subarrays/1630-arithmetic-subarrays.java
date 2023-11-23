class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();

        for(int i=0;i<l.length;i++){
            int[] a = Arrays.copyOfRange(nums, l[i], r[i]+1);
            boolean add = true; 
            Arrays.sort(a);

            System.out.println();
            if(a.length==1){
                ans.add(add);
                break;
            }
            int dif=a[1]-a[0];
            for(int j=1;j<a.length;j++){
                int d = a[j]-a[j-1];
                if(d!=dif){
                    add = false;
                    break;
                }
            }
            ans.add(add);
        }

        return ans;
    }
}