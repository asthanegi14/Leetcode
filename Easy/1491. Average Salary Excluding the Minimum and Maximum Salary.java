class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum += (double)salary[i];
        }

        return sum/(salary.length-2);
    }
}
