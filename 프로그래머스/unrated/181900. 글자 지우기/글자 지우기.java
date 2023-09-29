import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if(!contains(indices,i)){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}