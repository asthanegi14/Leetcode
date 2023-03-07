class Solution {
    public boolean isValidSudoku(char[][] b) {
        int i=0;
        while(i<9){
            HashMap<Character, Integer> map = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            int j=0,k=0;

            //To check the rows
            while(j<9){
                if(b[i][j]!='.'){
                    if(!map.containsKey(b[i][j])){
                        map.put(b[i][j],0);
                    }
                    else{
                        // System.out.println("rows loop p = "+b[i][j]);
                        // System.out.println("map1 = "+map);
                        return false;
                    }
                }
                j++;
            }
            //To check the columns
            while(k<9){
                if(b[k][i]!='.'){
                    if(!map2.containsKey(b[k][i])){
                        map2.put(b[k][i],0);
                    }
                    else{
                        // System.out.println("map2 = "+map2);
                        // System.out.println("column loop p = "+b[k][i]);
                        return false;
                    }
                }
                k++;
            }
            i++;

        }  
        i=0;
        while(i<9){
            boolean vis[] = new boolean[9];
            for(int j=i/3*3; j<i/3*3+3; j++){
                for(int k=i%3*3; k<i%3*3+3 ;k++){
                    if(b[j][k]!='.'){
                        if(vis[b[j][k]-'1']){
                            return false;
                        }
                        vis[b[j][k]-'1']=true;
                    }
                }
            }
            i++;
        }

        return true;
    }
}
