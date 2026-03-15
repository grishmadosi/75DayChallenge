class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return sum(grid,0,0,dp);
    }
    public int sum(int[][] grid, int row, int col,int[][] dp){
        if(row == grid.length-1 && col == grid[0].length-1){
            return grid[row][col];
        }
        if(dp[row][col] != -1) return dp[row][col];
        int pick= Integer.MAX_VALUE, notPick = Integer.MAX_VALUE;
        if(row < grid.length-1)
         pick = grid[row][col] + sum(grid, row+1, col,dp);
        if(col < grid[0].length-1)
        notPick = grid[row][col] + sum(grid,row,col+1,dp);
        return dp[row][col] = Math.min(pick,notPick);
    }
}