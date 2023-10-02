import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] array = Arrays.stream(arr).distinct().toArray();
        int[] answer = Arrays.copyOf(array, k);

        for(int i = array.length; i < answer.length; i++){
            answer[i] = -1;
        }
        return answer;
    }
}