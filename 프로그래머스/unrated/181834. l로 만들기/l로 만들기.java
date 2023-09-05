import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public String solution(String myString) {
        String answer = "";
        String pattern = "^[a-k]";
        
        for(String str : myString.split("")){
            answer += Pattern.matches(pattern, str) ? "l" : str;
        }
        
        return answer;
    }
}