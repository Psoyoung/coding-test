import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String,String> map = new HashMap<>();
        for(String str : strings){
            map.put(str, str.substring(n,n+1));
        }

        String[] answer = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .map(entry -> entry.getKey())
                .toArray(String[]::new);

        return answer;
    }
}