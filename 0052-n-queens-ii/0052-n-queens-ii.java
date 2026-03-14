class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queen(board,0);
    }
    public int queen(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }
        int count = 0;
        for(int col = 0; col < board[0].length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queen(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    public boolean isSafe(boolean[][] board, int row, int col){
        for(int i = row; i>= 0; i--){
            if(board[i][col]) return false;

        }
        int maxLength = Math.min(row,col);
        for(int i = 1; i <= maxLength; i++){
            if(board[row-i][col-i]) return false;
        }
        maxLength= Math.min(row, board.length-col-1);
        for(int i = 1; i <= maxLength; i++){
            if(board[row-i][col+i]) return false;
        }
        return true;
    }
}