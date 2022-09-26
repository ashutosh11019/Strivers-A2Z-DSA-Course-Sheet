class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] visit = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(findAns(board, i, j, visit, 0, word)){
                            return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean findAns(char[][] b, int row, int col, int[][] visit, int i, String s){
        if(row < 0 || row >= b.length || col < 0 || col >= b[0].length || visit[row][col] == 1){
            return false;
        }
        if(b[row][col] != s.charAt(i)){
            return false;
        }else{
            i++;
            if(i == s.length()){
                return true;
        }
        }
        visit[row][col] = 1;
        if(findAns(b, row+1, col, visit, i, s)){
            return true;
        }
        if(findAns(b, row-1, col, visit, i, s)){
            return true;
        }
        if(findAns(b, row, col-1, visit, i, s)){
            return true;
        }
        if(findAns(b, row, col+1, visit, i, s)){
            return true;
        }
        visit[row][col] = 0;
        return false;
    }
}