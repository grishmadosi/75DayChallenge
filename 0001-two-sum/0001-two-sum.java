class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ans = {-1 , -1};
       for(int i = 0; i < nums.length; i++){
        int sum = 0;
        for(int j = 0; j < nums.length ; j++){
            if(i == j && nums[i] == nums[j]){
                break;
            }
            else{
                sum = nums[i] + nums[j];
                if(sum == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
       } 
       return ans;
    }
}