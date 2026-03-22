class Solution {
    public int maxArea(int[] height) {
       int lp = 0;
      int rp = height.length-1, maxArea=0;
      while(lp < rp){
        int w = rp - lp;
        int ht = Math.min(height[lp], height[rp]);
        int currArea = w * ht;
        maxArea = Math.max(maxArea, currArea);
        if(height[lp] < height[rp])
         lp++;
         else rp--;
      } 
      return maxArea; 
    } 
    
}