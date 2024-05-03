class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");        
        String[] b = version2.split("\\.");
        
        int i=0, j=0;
        
        while(i<a.length && j<b.length){
            int x = Integer.parseInt(a[i]), y = Integer.parseInt(b[j]);
            // System.out.println("x = "+x+" y = "+y);
            if(x>y){
                return 1;
            }
            else if(x<y){
                return -1;
            }
            i++; j++;
        }
        int x = 0, y=0;
        
        while(i<a.length){
            int l = Integer.parseInt(a[i]);
            
            if(l!=0){
                x = x*10+l;
            }
            i++;
        }
        
        if(x!=0){
            return 1;
        }
        
        while(j<b.length){
            int l = Integer.parseInt(b[j]);
            
            if(l!=0){
                y = y*10+l;
            }
            j++;
        }
        
        if(y!=0){
            return -1;
        }
        return 0;
    }
}