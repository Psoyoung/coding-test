import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i = 0; i < arr.length; i++){
            int index = findIndex(emergency,arr[i]);
            answer[index] = i+1;
        }
        
        return answer;
    }
    
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // 값을 찾았을 경우 해당 인덱스 반환
            }
        }
        return -1; // 값을 찾지 못한 경우 -1 반환
    }
}