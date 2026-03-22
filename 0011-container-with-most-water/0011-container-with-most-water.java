class Solution {
    public int maxArea(int[] height) {
      int lp = 0;
      int rp = height.length-1, maxArea=0;
      while(lp < rp){
        int w = rp - lp;
        int ht = min(height[lp], height[rp]);
        int currArea = w * ht;
        maxArea = max(maxArea, currArea);
        if(height[lp] < height[rp])
         lp++;
         else rp--;
      } 
      return maxArea; 
    }
    public int min(int a, int b){
        if(a < b){
            return a;
        }else
        return b;
    }
    public int max(int a , int b){
        if(a > b){
            return a;
        }else
        return b;
    }
}