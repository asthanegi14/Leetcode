class Pair{
    int a,b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        //TC: O(n2)

        // int sum = 0;
        // int mod = (int)Math.pow(10,9)+7;
        
        // for(int i=0;i<arr.length;i++){
        //     int min = Integer.MAX_VALUE;
        //     for(int j=i;j<arr.length;j++){
        //         min = Math.min(min,arr[j]);
        //         sum+=min;
        //     }
        //     sum = sum%mod;
        // }
        // return sum;

        Stack<Pair> st = new Stack<>();
        Stack<Pair> st2 = new Stack<>();

        long mod = (long)Math.pow(10,9)+7;

        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int count=1;
            while(st.size()!=0 && st.peek().a>=arr[i]){
                count+=st.pop().b;
            }
            st.push(new Pair(arr[i],count));
            l[i] = count;
        }

        for(int i=arr.length-1;i>=0;i--){
            int count=1;
            while(st2.size()!=0 && st2.peek().a>arr[i]){
                count+=st2.pop().b;
            }
            st2.push(new Pair(arr[i],count));
            r[i] = count;
        }
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum = (sum + (long) arr[i] * l[i] * r[i]) % mod;
        }

        return (int)sum;
    }
}
