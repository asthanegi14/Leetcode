class Solution {
    class Node{
        int r,c;
        String key;

        Node(int r, int c, String key){
            this.r = r;
            this.c = c;
            this.key = key;
        }

        public String toString(int r, int c, String key){
            return r+"-"+c+"-"+key;
        }
    }
    public void findKS(String[] grid, int[] keys, Queue<Node> q){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length();j++){
                char ch = grid[i].charAt(j);

                if(ch>='a' && ch<='f'){
                    keys[0]++;
                }
                else if(ch=='@'){
                    q.add(new Node(i, j, ""));
                }
            }
        }
    }
    public int shortestPathAllKeys(String[] grid) {
        int n = grid.length, m = grid[0].length();
        int[] keys= new int[1];
        int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        Set<String> vis = new HashSet<>();

        int ans = 0;
        Queue<Node> q = new LinkedList<>();

        findKS(grid, keys, q);

        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                Node curr = q.poll();
                int r = curr.r;
                int c = curr.c;
                String key = curr.key;
                if(!vis.contains(curr.toString(r, c, key))){
                    vis.add(curr.toString(r, c, key));
                }
                else{
                    continue;
                }

                if(key.length() == keys[0]){
                    return ans;
                }

                for(int[] k:dir){
                    int x = r+k[0]; 
                    int y = c+k[1]; 

                    Node newNode = new Node(x, y, key);

                    if(x<0 || x>=n || y<0 || y>=m || grid[x].charAt(y)=='#' || vis.contains(newNode.toString(x, y, key))){
                        continue;
                    }

                    char ch = grid[x].charAt(y);

                    if(key.indexOf(ch) == -1 && ch>='a' && ch<='f'){
                        q.add(new Node(x, y, key+ch));
                    }
                    else if(ch>='A' && ch<='F' && key.indexOf(Character.toLowerCase(ch))==-1){
                        continue;
                    }
                    else{
                        q.add(new Node(x, y, key));
                    }
                }
            }
            ans+=1;
        }
        return -1;
    }
}
