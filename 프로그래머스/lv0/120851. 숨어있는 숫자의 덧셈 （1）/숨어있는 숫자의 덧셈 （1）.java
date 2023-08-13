class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char c : my_string.toCharArray()){
            answer += isInt(String.valueOf(c));
        }
        
        return answer;
    }
    
    public static int isInt(String str) {
        try {
            int num = Integer.parseInt(str);
            return num;
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}