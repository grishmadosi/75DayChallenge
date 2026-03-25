class Solution {
    public int fib(int n) {
        //fibonacci dynamic programming]
        // if(n == 0) return 0;
        // int[] dp = new int[n];
        // Arrays.fill(dp,-1);
        // return fibonacci(dp, n-1);
        //tabulation
        if(n <= 1) return n;
        int prev = 0;
        int prev2 = 1;
        for(int i = 2; i <= n+1; i++){
          int curr = prev + prev2;
          prev2 = prev;
          prev = curr;
        }
        return prev;
    }
    // public int fibonacci(int[] dp, int n){
    //     if(n== 1 || n == 0) return 1;
    //     if(dp[n] != -1) return dp[n];
    //     return dp[n] = fibonacci(dp, n-1)+fibonacci(dp, n-2);
    // }
}