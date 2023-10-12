import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];      

        for(int i = 0; i < commands.length; i++){
            int sta = commands[i][0]-1;
            int end = commands[i][1];
            
            int[] arr = Arrays.copyOfRange(array, sta, end);
            Arrays.sort(arr);
            
            answer[i] = arr[commands[i][2]-1];
        }
        
        return answer;
    }
}