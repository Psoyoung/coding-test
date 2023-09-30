import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        int startIdx = -1, lastIdx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                startIdx = i;
                break;
            }
        }
        
        if(startIdx == -1) return answer;
        
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == 2){
                lastIdx = i+1;
                break;
            }
        }
        return Arrays.copyOfRange(arr,startIdx,lastIdx);
    }
}