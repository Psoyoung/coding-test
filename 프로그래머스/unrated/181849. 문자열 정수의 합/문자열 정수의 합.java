class Solution {
    public int solution(String c) {
        int answer = 0;
        for(char n : c.toCharArray()){
            answer += Character.getNumericValue(n);
        }
        return answer;
    }
}