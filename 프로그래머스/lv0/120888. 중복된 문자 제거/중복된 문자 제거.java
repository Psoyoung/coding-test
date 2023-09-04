import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string) {
    
        return Arrays.asList(my_string.split(""))
                    .stream()
                    .distinct()
                    .collect(Collectors.joining());
    }
}