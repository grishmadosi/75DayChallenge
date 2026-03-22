class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0;
        while(i < nums.length){
           int j = i+1;
   
           while(j < nums.length){
              if(nums[j]+nums[i] == target){
                  ans[0] = i+1;
                  ans[1] = j+1;
                  break;
              }
              if(nums[j]+nums[i] > target) break;
              j++;
           }
           i++;
        }
        return ans;
    }
}