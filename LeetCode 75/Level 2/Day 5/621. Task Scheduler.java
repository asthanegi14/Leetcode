class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];

        for(int i=0;i<tasks.length;i++){
            map[tasks[i]-'A']++;
        }

        Arrays.sort(map);

        int num = map[25]-1;
        int ideal = num*n;

        for(int i=24;i>=0;i--){
            ideal -=Math.min(map[i], num);
        }

        return ideal<0 ? tasks.length:tasks.length+ideal;
    }
}
