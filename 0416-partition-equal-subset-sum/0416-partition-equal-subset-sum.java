class Solution {
    public boolean canPartition(int[] nums) {
        int totSum = 0;
        for(int a : nums) totSum += a;
        if(totSum%2 != 0) return false;
        int tar = totSum/2;
        int[][] dp = new int[nums.length][tar+1];
        for(int[] row: dp) Arrays.fill(row,-1);
        return sumP(nums, tar, 0, 0, dp);
    }
    public boolean sumP(int[] nums, int tar, int idx, int sum, int[][] dp){
        if(idx == nums.length){
            return sum == tar;
        }
        if(dp[idx][sum] != -1) return sum == tar;
        if(sum + nums[idx] <= tar){
            dp[idx][sum] = sum+nums[idx];
            if(sumP(nums,tar, idx+1,sum + nums[idx], dp)) return true;
        }

        if(sumP(nums,tar,idx+1, sum, dp)) return true;

        return false;
    }
}