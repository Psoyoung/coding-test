import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length; //행
        int col = arr[0].length; //열
        
        if(row == col) return arr;
        
        int n = row > col ? row : col;
        int[][] answer = new int[n][n];
        
        for(int i = 0; i < n; i++){
            if(row > col){
                answer[i] = Arrays.copyOf(arr[i], n);
            }else{
                if(i < row){
                    answer[i] = arr[i];
                }else{
                    answer[i] = new int[n];
                }
            }
        }
        return answer;
    }
}