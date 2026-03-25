class Solution {
    public int trap(int[] height) {
        int lmax = 0, rmax = 0;
        int l = 0, r = height.length-1;
        int tot = 0;
        while(l < r){
            lmax = Math.max(lmax,height[l]);  //ek max range nikalenge
            rmax = Math.max(rmax,height[r]);

            if(lmax < rmax){     //least value se fark padega to always search for minimum
                tot += (lmax-height[l]);
                l++;
            }else{
                tot += (rmax - height[r]);
                r--;
            }
        }
        return tot;
    }
}