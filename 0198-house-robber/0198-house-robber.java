class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp,-1);
        // return money(nums, n,0, dp);

        //----Tabulation form
        int[] dp = new int[n];
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    // public int money(int[] nums, int n, int idx,int[] dp){
    //     if(idx == n-1) return nums[idx];
    //     if(idx >= n) return 0;
    //     if(dp[idx] != -1) return dp[idx];

    //     int notPick = money(nums, n , idx+1,dp);
    //     int pick = money(nums,n,idx+2,dp) + nums[idx];
    //     return dp[idx] = Math.max(pick,notPick);
    // }
}