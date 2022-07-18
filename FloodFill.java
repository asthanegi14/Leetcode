class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int color = image[sr][sc];
        if(color != newColor)
        {
            clr(image,sr,sc,color,newColor);
        }
        return image;
    }
    void clr(int image[][],int sr,int sc,int color,int newColor)
    {
        if(image[sr][sc]!=color)
        {
            return;
        }
        image[sr][sc]=newColor;
        if(sr-1>=0)
        {
            clr(image,sr-1,sc,color,newColor);
        }
        if(sc+1<image[0].length)
        {
            clr(image,sr,sc+1,color,newColor);
        }
        if(sr+1<image.length)
        {
            clr(image,sr+1,sc,color,newColor);
        }
        if(sc-1>=0)
        {
            clr(image,sr,sc-1,color,newColor);
        }
    }
}
