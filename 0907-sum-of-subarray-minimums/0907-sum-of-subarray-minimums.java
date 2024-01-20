class Solution {
    class Pair{
        int num, count;
        Pair(int num, int count){
            this.num = num;
            this.count = count;
        }
    }
    public int sumSubarrayMins(int[] arr) {
        Stack<Pair> st = new Stack<>();

        int[] smlL = new int[arr.length];
        int[] smlR = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int number=1;
            while(!st.isEmpty() && st.peek().num>=arr[i]){
                number+= st.pop().count;
            }
            st.push(new Pair(arr[i],number));
            smlL[i] = number;
        }

        st.clear();
        
        for(int i=arr.length-1;i>=0;i--){
            int number=1;
            while(!st.isEmpty() && st.peek().num>arr[i]){
                number+= st.pop().count;
            }
            st.push(new Pair(arr[i],number));
            smlR[i] = number;
        }
        long sum=0;
        long mod = (long)Math.pow(10,9)+7;

        for(int i=0;i<arr.length;i++){
            sum = (sum + (long)arr[i]*smlL[i]*smlR[i])%mod;
        }

        return (int)sum;
    }
}