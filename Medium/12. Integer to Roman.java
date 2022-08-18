class Solution {
    public String intToRoman(int num) {
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] con = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuffer ans = new StringBuffer();
        for(int i=0;num>0;i++)
        {
            while(num>=val[i]){
                ans.append(con[i]);
                num -= val[i];
            }
        }
        return ans.toString();
    }
}
