import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        answer = Arrays.stream(answer.split("")).sorted().collect(Collectors.joining());
        return answer;
    }
}