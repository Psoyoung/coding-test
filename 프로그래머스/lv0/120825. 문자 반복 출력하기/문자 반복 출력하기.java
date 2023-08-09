class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] charList = my_string.toCharArray();

        for(char c : charList){
            for(int i = n; i > 0; i--){
                answer+= c;
            }
        }
        return answer;
    }
}