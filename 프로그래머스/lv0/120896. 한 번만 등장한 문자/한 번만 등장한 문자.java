import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(char c : s.toCharArray()){
            if(countChar(s, c) == 1) answer += c;
        }
        
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
 
        return answer;
    }
    
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}