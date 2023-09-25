import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[list.size()]);
    }
}