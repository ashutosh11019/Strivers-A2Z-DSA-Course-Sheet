class Solution
{
    public boolean isWordExist(char[][] board, String word){
        // Code here
        int[][] vis = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && solve(board, word, 0, i, j, vis)) return true;
            }
        }
        return false;
    }
    
    public static boolean solve(char[][] board, String word, int ind, int i, int j, int[][] vis){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || ind>=word.length() || vis[i][j]==1) return false;
        if(board[i][j] != word.charAt(ind)) return false;
        if((ind+1)==word.length()) return true;
        vis[i][j]=1;
        if(solve(board, word, ind+1, i+1, j, vis)) return true;
        if(solve(board, word, ind+1, i, j+1, vis)) return true;
        if(solve(board, word, ind+1, i-1, j, vis)) return true;
        if(solve(board, word, ind+1, i, j-1, vis)) return true;
        vis[i][j]=0;
        return false;
    }
}