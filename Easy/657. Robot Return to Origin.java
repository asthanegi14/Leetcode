class Solution {
    public boolean judgeCircle(String moves) {
        int up=0, dwn=0, lef=0, rig=0;

        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c=='U'){
                up++;
            }
            if(c=='D'){
                dwn++;
            }
            if(c=='L'){
                lef++;
            }
            if(c=='R'){
                rig++;
            }
        }

        int diffA = Math.abs(up-dwn);
        int diffB = Math.abs(lef-rig);

        return diffA==0 && diffB==0;
    }
}
