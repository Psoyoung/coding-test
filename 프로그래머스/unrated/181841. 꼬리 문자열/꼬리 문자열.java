import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        Arrays.stream(str_list).filter(i-> !i.contains(ex)).forEach(i-> sb.append(i));
        return String.valueOf(sb);
    }
}