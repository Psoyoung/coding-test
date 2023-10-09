import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String,Integer> map = new HashMap<>();

        for(String str : participant){
            int cnt = map.containsKey(str) ? map.get(str) : 0;
            map.put(str, ++cnt);
        }

        for(String str : completion){
            int cnt = map.get(str);
            if(cnt == 1){
                map.remove(str);
            }else{
                map.put(str, --cnt);
            }
        }
        
        String answer = map.keySet().toString().replaceAll("\\W","");
        return answer;
    }
}