class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return path(m,n, 0,0,dp);
    }
    public int path(int m, int n, int row, int col,int[][] dp){
        if(row == m-1 && col == n-1) return 1;
        if(row >= m || col >= n) return 0;
        if(dp[row][col] != -1) return dp[row][col];
        int sum = 0;
        if(row < m-1)
        sum += path(m, n, row+1,col,dp);
        if(col < n-1)
        sum += path(m,n,row,col+1,dp);
        return dp[row][col] = sum; 
    }
}