class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        for(String key : keyinput){
            switch (key){
                case "up":
                    if(board[1]/2 > answer[1]) answer[1] += 1;
                    break;
                case "down":
                    if((board[1]/2)*-1 < answer[1]) answer[1] -= 1;
                    break;
                case "left":
                    if((board[0]/2)*-1 < answer[0]) answer[0] -= 1;
                    break;
                case "right":
                    if(board[0]/2 > answer[0]) answer[0] += 1;
                    break;
            }    
        }
           
        return answer;
    }
}