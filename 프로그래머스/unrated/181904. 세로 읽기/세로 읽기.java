class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int index = c - 1;
        
        while (index < my_string.length()) {
            answer += my_string.charAt(index);
            index += m;
        }
        return answer;
    }
}