class Solution {
    public String solution(int age) {
        String answer = "";
        
        for(char c : Integer.toString(age).toCharArray()){
            int num = (int)c+49;
            answer += (char)num;
        }
        
        return answer;
    }
}