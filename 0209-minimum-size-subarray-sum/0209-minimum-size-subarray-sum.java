class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, flag = 0;
        int sum = 0, min = Integer.MAX_VALUE;
        while(j <= nums.length && i < nums.length){
            while(j < nums.length && sum < target){
                sum += nums[j];
                j++;
            }
            if(sum >= target){
             flag = 1;
             min = Math.min(min,j-i);
             if(min == 1) return 1;
            }
            sum = sum - nums[i];
            i++;
        }

        if(flag == 0) return 0;
        return min;
    }
}