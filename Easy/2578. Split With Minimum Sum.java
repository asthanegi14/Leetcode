class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(num>=1){
            arr.add(num%10);
            num/=10;
        }
        Collections.sort(arr);
        int max = 0, min = 0, sum=0;

        for(int i=0;i<arr.size();i++){
            if(i%2==0){
                max = max*10+arr.get(i);
            }
            else{
                min = min*10+arr.get(i);
            }
        }
        sum = max+min;
        return sum;
    }
}
