class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return money(nums, n,0, dp);
    }
    public int money(int[] nums, int n, int idx,int[] dp){
        if(idx == n-1) return nums[idx];
        if(idx >= n) return 0;
        if(dp[idx] != -1) return dp[idx];

        int notPick = money(nums, n , idx+1,dp);
        int pick = money(nums,n,idx+2,dp) + nums[idx];
        return dp[idx] = Math.max(pick,notPick);
    }
}