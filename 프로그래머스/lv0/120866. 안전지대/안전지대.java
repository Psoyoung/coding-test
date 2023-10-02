class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    int top = i - 1;
                    int bottom = i + 1;
                    int left = j - 1;
                    int right = j + 1;
                    
                    if(top >= 0){
                        board[top][j] = board[top][j] == 1 ? 1 : 2;
                        if(left >= 0) board[top][left] = board[top][left] == 1 ? 1 : 2;
                        if(right < len) board[top][right] = board[top][right] == 1 ? 1 : 2;
                    }
                    if(bottom < len){
                        board[bottom][j] = board[bottom][j] == 1 ? 1 : 2;
                        if(left >= 0) board[bottom][left] = board[bottom][left] == 1 ? 1 : 2;
                        if(right < len) board[bottom][right] = board[bottom][right] == 1 ? 1 : 2;
                    }
                    if(left >= 0) board[i][left] = board[i][left] == 1 ? 1 : 2;
                    if(right < len) board[i][right] = board[i][right] == 1 ? 1 : 2;
                }
            }
        }

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}