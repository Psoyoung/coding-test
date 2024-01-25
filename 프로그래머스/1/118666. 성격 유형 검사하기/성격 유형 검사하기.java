import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Character[] arr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        Map<Character, Integer> map = Arrays.stream(arr)
                                        .collect(Collectors.toMap(c->c, c->0));

        for(int i = 0; i < survey.length; i++) {
            char s1 = survey[i].charAt(0);
            char s2 = survey[i].charAt(1);

            switch (choices[i]) {
                case 1 :
                    map.put(s1, map.get(s1)+3);
                    break;
                case 2 :
                    map.put(s1, map.get(s1)+2);
                    break;
                case 3 :
                    map.put(s1, map.get(s1)+1);
                    break;
                case 5 :
                    map.put(s2, map.get(s2)+1);
                    break;
                case 6 :
                    map.put(s2, map.get(s2)+2);
                    break;
                case 7 :
                    map.put(s2, map.get(s2)+3);
                    break;
            }
        }

        for(int i = 0; i < arr.length; i+=2) {
            char c1 = arr[i];
            char c2 = arr[i+1];

            if(map.get(c1) == map.get(c2)) {
                answer += Character.compare(c1, c2) < 0 ? c1 : c2;
            }else if(map.get(c1) > map.get(c2)) {
                answer += c1;
            }else {
                answer += c2;
            }
        }
        
        return answer;
    }
}