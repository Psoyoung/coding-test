import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String str : dic){
            long count = Arrays.stream(spell).filter(i -> str.contains(i)).count();
            if(count == spell.length) answer = 1;
        }
        return answer;
    }
}